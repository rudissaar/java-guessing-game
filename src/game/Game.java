package game;

import display.Display;

public class Game {
    private Display display;

    public Game(int width, int height) {
        this.display = new Display(width, height);
    }

    public void render() {
        display.render();
    }
}
