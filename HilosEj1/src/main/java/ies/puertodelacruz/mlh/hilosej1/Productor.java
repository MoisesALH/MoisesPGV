package ies.puertodelacruz.mlh.hilosej1;

public class Productor extends Thread{
    private Buffer buffer;

    public Productor(Buffer buffer){
        this.buffer = buffer;
    }

    @Override
    public void run(){
        for (int i = 0; i < 15; i++) {
            char letra = (char)('A' + i);
            try {
                buffer.producir(letra);
                Thread.sleep((int)(Math.random()*2000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
