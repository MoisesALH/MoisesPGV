package es.iespuertodelacruz.es.mlh;

public class SaleJardin extends Thread{
    private RecursoJardin jardin;

    public SaleJardin(String nombre, RecursoJardin jardin){
        this.setName(nombre);
        this.jardin = jardin;
    }

    @Override
    public void run(){
        jardin.decrementarCuenta();
    }
}
