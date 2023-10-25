package es.iespuertodelacruz.mlh;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int barcos;
    }
    /*
    private static final int BOARD_SIZE = 5;
    private static char[][] board;
    private static boolean[][] marked;
    private static int targetRow, targetCol;
    private static boolean gameOver = false;

    public static void main(String[] args) {
        board = new char[BOARD_SIZE][BOARD_SIZE];
        marked = new boolean[BOARD_SIZE][BOARD_SIZE];
        initializeBoard();

        Thread userThread = new Thread(() -> {
            Scanner scanner = new Scanner(System.in);
            while (!gameOver) {
                System.out.print("Introduce una letra y un número (ejemplo: A2): ");
                String input = scanner.nextLine();
                if (input.length() != 2) {
                    System.out.println("Entrada inválida. Debe ser una letra y un número.");
                    continue;
                }
                char letter = input.charAt(0);
                int number = Character.getNumericValue(input.charAt(1));
                if (letter >= 'A' && letter < 'A' + BOARD_SIZE && number >= 1 && number <= BOARD_SIZE) {
                    checkGuess(letter - 'A', number - 1);
                } else {
                    System.out.println("Entrada inválida. Letra entre A y E, número entre 1 y 5.");
                }
            }
        });

        Thread gameThread = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Random random = new Random();
            while (!gameOver) {
                int row = random.nextInt(BOARD_SIZE);
                int col = random.nextInt(BOARD_SIZE);
                if (!marked[row][col]) {
                    markCell(row, col);
                }
            }
        });

        userThread.start();
        gameThread.start();

        try {
            userThread.join();
            gameThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Fin del juego.");
    }

    private static void initializeBoard() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                board[i][j] = '~'; // Agua
                marked[i][j] = false;
            }
        }
        targetRow = (new Random()).nextInt(BOARD_SIZE);
        targetCol = (new Random()).nextInt(BOARD_SIZE);
    }

    private static void checkGuess(int row, int col) {
        if (row == targetRow && col == targetCol) {
            System.out.println("¡Tocado y hundido! Has ganado.");
            gameOver = true;
        } else if (marked[row][col]) {
            System.out.println("Ya habías seleccionado esta posición. Prueba de nuevo.");
        } else {
            System.out.println("Agua. Inténtalo de nuevo.");
            marked[row][col] = true;
        }
    }

    private static void markCell(int row, int col) {
        if (row == targetRow && col == targetCol) {
            System.out.println("¡El enemigo te ha tocado!");
            gameOver = true;
        } else {
            System.out.println("El enemigo ha disparado a la posición " + (char) ('A' + row) + (col + 1) + " - Agua.");
            marked[row][col] = true;
        }
    }

     */
}