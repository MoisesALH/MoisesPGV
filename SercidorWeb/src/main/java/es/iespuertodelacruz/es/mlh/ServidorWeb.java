package es.iespuertodelacruz.es.mlh;

public class ServidorWeb {
    private int cuenta;

    public ServidorWeb(){
        this.cuenta = 0;
    }

    public void incrementarCuenta(){
        System.out.println(Thread.currentThread().getName() + " ---> Entra en el servidor");
        this.cuenta++ ;
        System.out.println("Hay " + getCuenta() + " terminales en el servidor");
    }

    public int getCuenta(){
        return this.cuenta;
    }
}
