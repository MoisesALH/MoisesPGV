package es.iespuertodelacruz.es.mlh;

import java.util.concurrent.Semaphore;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Semaphore[] palillos = new Semaphore[5];
        String[] nombre = {"Rels b", "Eladio carrion", "Feid", "Messi", "Bad bunny"};
        for (int i = 0; i < 5; i++) {
            palillos[i] = new Semaphore(1,true);
        }

        for (int i = 0; i < 5; i++) {
            if(i == 4){
                new Filosofo(nombre[i],palillos[i], palillos[0]).start();
            }else{
                new Filosofo(nombre[i],palillos[i], palillos[i+1]).start();
            }
        }
    }
}