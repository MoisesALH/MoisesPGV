package es.iespuertodelacruz.mlh.model;

import java.util.Scanner;

public class User extends Thread{
    private final Game game;

    public User(Game game) {
        this.game = game;
    }

    /**
     * El jugador pide el turno para poder jugar. Cuando pueda,  hará su jugada. Si los datos introducido son correctos, liberará el semaforo.
     */
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (!game.isGameOver()) {
            try {
                game.getTurno().acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (!game.isGameOver()) {
                System.out.print("Introduce una letra y un número (ejemplo: A2): ");
                String input = scanner.nextLine();
                while (input.length() != 2) {
                    System.out.println("Entrada inválida. Debe ser una letra y un número.");
                    input = scanner.nextLine();
                }
                char letter = input.charAt(0);
                int number = Integer.parseInt(input.charAt(1) + "");

                while (!(letter >= 'A' && letter < 'A' + game.getBoard().getSIZE() && number >= 1 && number <= game.getBoard().getSIZE())) {
                    System.out.println("Entrada inválida. Letra entre A y " + ((char) ('A' + game.getBoard().getSIZE()-1)) + ", número entre 1 y " + game.getBoard().getSIZE() + ".");
                    input = scanner.nextLine();
                    letter = input.charAt(0);
                    number = Integer.parseInt(input.charAt(1) + "");
                }
                game.checkGuess(letter - 'A', number - 1);
                game.getTurno().release();
            }
        }
    }
}
