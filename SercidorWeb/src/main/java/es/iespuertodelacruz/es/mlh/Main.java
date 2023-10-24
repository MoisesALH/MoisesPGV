package es.iespuertodelacruz.es.mlh;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ServidorWeb sw = new ServidorWeb();

        for (int i = 0; i < 4; i++) {
            (new EntraServidor("Entra" + i, sw)).start();
        }
    }
}