package es.iespuertodelacruz.es.mlh;

import java.util.concurrent.Semaphore;

public class Filosofo extends  Thread{
    private String nombre;
    private Semaphore palilloIzquierdo;

    private Semaphore palilloDerecho;

    public Filosofo(String nombre, Semaphore palilloIzquierdo, Semaphore getPalilloDerecho) {
        this.nombre = nombre;
        this.palilloIzquierdo = palilloIzquierdo;
        this.palilloDerecho = getPalilloDerecho;
    }

    public void cogerPalillos(){
        System.out.println(this.nombre + " quiere coger los palillos");
        try {
            palilloIzquierdo.acquire();
            palilloDerecho.acquire();

            System.out.println(this.nombre + " coge los palillos: ");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void run(){
        pensar();
        cogerPalillos();
        comer();
        soltarPalillos();
    }

    public void soltarPalillos(){
        System.out.println(this.nombre + " ha terminado de comer. Suelta los palillos");
        palilloIzquierdo.release();
        palilloDerecho.release();
    }

    public void pensar(){
        System.out.println(this.nombre + " esta pensando");
        try {
            Thread.sleep((int) (Math.random() * 5000));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void comer(){
        System.out.println(this.nombre + " esta comiendo");
        try {
            Thread.sleep((int) (Math.random()*5000));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String name) {
        this.nombre = name;
    }

    public Semaphore getPalilloIzquierdo() {
        return palilloIzquierdo;
    }

    public void setPalilloIzquierdo(Semaphore palilloIzquierdo) {
        this.palilloIzquierdo = palilloIzquierdo;
    }

    public Semaphore getPalilloDerecho() {
        return palilloDerecho;
    }

    public void setPalilloDerecho(Semaphore palilloDerecho) {
        this.palilloDerecho = palilloDerecho;
    }
}
