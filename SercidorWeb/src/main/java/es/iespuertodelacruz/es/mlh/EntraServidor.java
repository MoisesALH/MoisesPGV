package es.iespuertodelacruz.es.mlh;

public class EntraServidor extends Thread{
    private ServidorWeb sw;

    public EntraServidor(String nombre, ServidorWeb sw){
        this.setName(nombre);
        this.sw = sw;
    }

    @Override
    public void run(){
        synchronized (sw){
            for (int i = 0; i < (int)(Math.random() * 20); i++) {
                sw.incrementarCuenta();
            }
        }

    }
}
