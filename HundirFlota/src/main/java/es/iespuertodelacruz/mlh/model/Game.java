package es.iespuertodelacruz.mlh.model;

import java.util.concurrent.Semaphore;

public class Game {
    private Board board;

    private Semaphore turno;

    private boolean gameOver = false;

    public Game(int size, int cuantity) {
        this.board = new Board(size, cuantity);
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }

    public void checkGuess(int row, int col) {
        if (board.isTarget(row, col)) {
            System.out.println("¡Tocado y hundido! Has ganado.");
            gameOver = true;
        } else if (board.isMarked(row, col)) {
            System.out.println("Ya habías seleccionado esta posición. Prueba de nuevo.");
        } else {
            System.out.println("Agua. Inténtalo de nuevo.");
            board.mark(row, col);
        }
    }

    public void markCell(int row, int col) {
        if (board.isTarget(row, col)) {
            System.out.println("¡El enemigo te ha tocado!");
            gameOver = true;
        } else {
            System.out.println("El enemigo ha disparado a la posición " + (char) ('A' + row) + (col + 1) + " - Agua.");
            board.mark(row, col);
        }
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Semaphore getTurno() {
        return turno;
    }

    public void setTurno(Semaphore turno) {
        this.turno = turno;
    }
}
