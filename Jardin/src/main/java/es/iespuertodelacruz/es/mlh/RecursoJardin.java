package es.iespuertodelacruz.es.mlh;

public class RecursoJardin {
    private int cuenta;

    public RecursoJardin(){
        this.cuenta = 100;
    }

    public synchronized void incrementarCuenta(){
        System.out.println(Thread.currentThread().getName() + " ---> Entra en el jardin");
        this.cuenta++ ;
        System.out.println("Hay " + getCuenta() + " Personas en el jardin");
    }

    public synchronized void decrementarCuenta(){
        System.out.println(Thread.currentThread().getName() + " ---> Sale del jardin");
        this.cuenta--;
        System.out.println("Hay " + getCuenta() + " Personas en el jardin");
    }

    public int getCuenta(){
        return this.cuenta;
    }
}
