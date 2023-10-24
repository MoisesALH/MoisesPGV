package es.iespuertodelacruz.es.mlh;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        RecursoJardin rj = new RecursoJardin();
        for (int i = 0; i < 10; i++) {
            (new EntradaJardin("Entra" + i, rj)).start();
        }

        for (int i = 0; i < 15; i++) {
            (new EntradaJardin("Sale" + i, rj)).start();
        }
    }
}