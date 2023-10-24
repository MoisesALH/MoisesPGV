package ies.puertodelacruz.mlh.hilosej1;


public class Consumidor extends Thread{
    private Buffer buffer;

    public Consumidor(Buffer buffer){
        this.buffer = buffer;
    }

    @Override
    public void run(){
        for (int i = 0; i < 15; i++){
            char dato = buffer.consumir();
            try {
                Thread.sleep((int)(Math.random()*3000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
