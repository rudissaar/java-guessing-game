package game;

import display.Display;
import state.State;

public class Game {
    private Display display;
    private State state;

    public Game(int width, int height) {
        this.display = new Display(width, height);
    }

    public void render() {
        display.render(state);
    }
}
