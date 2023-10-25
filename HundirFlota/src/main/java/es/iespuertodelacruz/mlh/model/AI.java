package es.iespuertodelacruz.mlh.model;

import java.util.Random;

public class AI extends Thread {
    private final Game game;

    public AI(Game game) {
        this.game = game;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Random random = new Random();
        while (!game.isGameOver()) {
            int row = random.nextInt(Board.SIZE);
            int col = random.nextInt(Board.SIZE);
            if (!game.getBoard().isMarked(row, col)) {
                game.markCell(row, col);
            }
        }
    }
}
