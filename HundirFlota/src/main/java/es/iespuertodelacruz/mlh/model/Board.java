package es.iespuertodelacruz.mlh.model;

import java.util.Random;

public class Board {
    private final int SIZE;
    private char[][] board;
    private boolean[][] marked;
    private int targetRow, targetCol;

    public Board(int size) {
        this.SIZE = size;
        this.board = new char[SIZE][SIZE];
        this.marked = new boolean[SIZE][SIZE];
        initialize();
    }

    private void initialize() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = '~'; // Agua
                marked[i][j] = false;
            }
        }
        targetRow = (new Random()).nextInt(SIZE);
        targetCol = (new Random()).nextInt(SIZE);
    }

    public boolean isMarked(int row, int col) {
        return marked[row][col];
    }

    public void mark(int row, int col) {
        marked[row][col] = true;
    }

    public boolean isTarget(int row, int col) {
        return row == targetRow && col == targetCol;
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

    public int getTargetRow() {
        return targetRow;
    }

    public void setTargetRow(int targetRow) {
        this.targetRow = targetRow;
    }

    public int getTargetCol() {
        return targetCol;
    }

    public void setTargetCol(int targetCol) {
        this.targetCol = targetCol;
    }
}
