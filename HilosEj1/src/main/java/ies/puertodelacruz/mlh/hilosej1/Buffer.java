package ies.puertodelacruz.mlh.hilosej1;

public class Buffer {
    private final char[] buffer = new char[6];
    private int index;

    public Buffer(){
        this.index = 0;
    }

    public synchronized void producir(char letra) throws InterruptedException {
        while(index >= buffer.length){
            wait();
        }
        buffer[index] = letra;
        index++;
        System.out.println("Produjo: " + letra);
        notify();
    }

    public synchronized char consumir(){
        while (index <= 0){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        char letra = buffer[index-1];
        index--;
        System.out.println("Consumido: " + letra );
        notify();
        return letra;
    }
}
