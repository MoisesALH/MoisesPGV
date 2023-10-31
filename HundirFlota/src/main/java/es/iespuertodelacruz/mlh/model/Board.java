package es.iespuertodelacruz.mlh.model;

import java.util.Random;

public class Board {
    private final int SIZE;
    private final int TARGET_CUANTITY;
    private char[][] board;
    private boolean[][] marked;
    private boolean[][] target;

    public Board(int size, int targetCunatity) {
        this.SIZE = size;
        this.board = new char[SIZE][SIZE];
        this.marked = new boolean[SIZE][SIZE];
        this.target = new boolean[SIZE][SIZE];
        this.TARGET_CUANTITY = targetCunatity;
        initialize();
    }

    private void initialize() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = '~'; // Agua
                marked[i][j] = false;
            }
        }

        for (int i = 0; i < TARGET_CUANTITY; i++){
            int x = (int)(Math.random() * SIZE);
            int y = (int)(Math.random() * SIZE);
            while (target[x][y]){
                x = (int)(Math.random() * SIZE);
                y = (int)(Math.random() * SIZE);
            }
            target[x][y] = true;
        }
    }

    public boolean isMarked(int row, int col) {
        return marked[row][col];
    }

    public void mark(int row, int col) {
        marked[row][col] = true;
    }

    public boolean isTarget(int row, int col) {
        return target[row][row];
    }

    public int getSIZE() {
        return SIZE;
    }

    public char[][] getBoard() {
        return board;
    }

    public void setBoard(char[][] board) {
        this.board = board;
    }

    public boolean[][] getMarked() {
        return marked;
    }

    public void setMarked(boolean[][] marked) {
        this.marked = marked;
    }

    public boolean[][] getTarget() {
        return target;
    }

    public void setTarget(boolean[][] target) {
        this.target = target;
    }
}
