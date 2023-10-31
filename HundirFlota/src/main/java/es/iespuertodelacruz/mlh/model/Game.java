package es.iespuertodelacruz.mlh.model;

import java.util.concurrent.Semaphore;

public class Game {
    private Board board;

    private Semaphore turno;
    /*
     Este semaforo es el mas importante del juego, ya que como su nombre bien dice, cesará el turno al juagdor o a la maquina.

     Como la maquina lo habia solicitado, se le dara el turno y cuando haga su jugada, lo liberará
     */

    private boolean gameOver = false;

    public Game(int size, int cuantity) {
        this.board = new Board(size, cuantity);
        turno = new Semaphore(1,true);
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }

    /**
     * Comprueba que el intento del jugador hunda un barco. Si es así, el juego acaba. Si no, marcará la casilla y mostrará el tablero
     * @param row
     * @param col
     */
    public void checkGuess(int row, int col) {
        if (board.isTarget(row, col)) {
            System.out.println("¡Tocado y hundido! Has ganado.");
            gameOver = true;
        } else if (board.isMarked(row, col)) {
            System.out.println("Ya habías seleccionado esta posición. Prueba de nuevo.");
        } else {
            System.out.println("Agua. Inténtalo de nuevo.");
            board.mark(row, col);
            board.mostrarTablero();
        }
    }

    /**
     * Comprueba que el inmtento de la maquina acierte en un barco. Marcará la casilla y mostrará el tablero
     * @param row
     * @param col
     */
    public void markCell(int row, int col) {
        if (board.isTarget(row, col)) {
            System.out.println("¡El enemigo te ha tocado!");
            gameOver = true;
        } else {
            System.out.println("El enemigo ha disparado a la posición " + (char) ('A' + row) + (col + 1) + " - Agua.");
        }
        board.mark(row, col);
        board.mostrarTablero();
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
