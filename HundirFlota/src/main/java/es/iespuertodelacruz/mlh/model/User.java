package es.iespuertodelacruz.mlh.model;

import java.util.Scanner;

public class User extends Thread{
    private final Game game;

    public User(Game game) {
        this.game = game;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (!game.isGameOver()) {
            System.out.print("Introduce una letra y un número (ejemplo: A2): ");
            String input = scanner.nextLine();
            if (input.length() != 2) {
                System.out.println("Entrada inválida. Debe ser una letra y un número.");
                continue;
            }
            char letter = input.charAt(0);
            int number = Character.getNumericValue(input.charAt(1));
            if (letter >= 'A' && letter < 'A' + game.getBoard().getSIZE() && number >= 1 && number <= game.getBoard().getSIZE()) {
                game.checkGuess(letter - 'A', number - 1);
            } else {
                System.out.println("Entrada inválida. Letra entre A y E, número entre 1 y 5.");
            }
        }
    }
}
