package game;

public class GameLoop implements Runnable {
    private Game game;
    private boolean running;

    public GameLoop(Game game) {
        this.game = game;
    }

    @Override
    public void run() {
        running = true;

        while (running) {
            render();
        }
    }

    public void render() {
        game.render();
    }
}
