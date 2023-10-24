package es.iespuertodelacruz.es.mlh;

public class EntradaJardin extends Thread{
    private RecursoJardin jardin;

    public EntradaJardin(String nombre, RecursoJardin jardin){
        this.setName(nombre);
        this.jardin = jardin;
    }

    @Override
    public void run(){
        jardin.incrementarCuenta();
    }
}
