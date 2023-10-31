package es.iespuertodelacruz.mlh.model;

import java.util.Random;

public class AI extends Thread {
    private final Game game;

    public AI(Game game) {
        this.game = game;
    }

    /**
     * La maquina pide el turno. Cuando pueda, hara su jugada y liberará el semaforo.
     */
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Random random = new Random();
        while (!game.isGameOver()) {
            try {
                game.getTurno().acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (!game.isGameOver()) {
                int row = random.nextInt(game.getBoard().getSIZE());
                int col = random.nextInt(game.getBoard().getSIZE());
                while (game.getBoard().isMarked(row, col)) {
                    row = random.nextInt(game.getBoard().getSIZE());
                    col = random.nextInt(game.getBoard().getSIZE());
                }
                game.markCell(row, col);
                game.getTurno().release();
            }
        }
    }
}
