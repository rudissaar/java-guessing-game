package display;

import state.State;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;

public class Display extends JFrame {
    private Canvas canvas;
    private Renderer renderer;

    public Display(int width, int height) {
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        canvas = new Canvas();
        canvas.setPreferredSize(new Dimension(width, height));
        canvas.setFocusable(false);
        add(canvas);

        pack();

        canvas.createBufferStrategy(2);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void render(State state) {
        BufferStrategy bufferStrategy = canvas.getBufferStrategy();
        Graphics graphics = bufferStrategy.getDrawGraphics();

        graphics.setColor(Color.BLACK);
        graphics.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());

        renderer.render(state, graphics);

        graphics.dispose();
        bufferStrategy.show();
    }
}
