import game.Game;
import game.GameLoop;

public class Launcher {
    private final static int WINDOW_WIDTH = 800;
    private final static int WINDOW_HEIGHT = 600;

    public static void main(String[] args) {
        new Thread(new GameLoop(new Game(WINDOW_WIDTH, WINDOW_HEIGHT)));
    }
}
