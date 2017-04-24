package model;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.List;

/**
 * Created by eugen on 24.04.2017.
 */
public class GameField {
    int WIDTH = 30;
    int HEIGHT = 30;
    private List<GameObject> enemies;
    private Player player;

    public void draw(Canvas canvas) {
        drawField(canvas);
        if (player==null) return;
        drawPlayer(canvas, player);
    }

    private void drawField(Canvas canvas) {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.WHITESMOKE);
        gc.fillRect(0,0, canvas.getWidth(), canvas.getHeight());
    }

    private void drawPlayer(Canvas canvas, Player player) {
        double size = Double.min(canvas.getWidth(), canvas.getHeight());
        double d = size/WIDTH;
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.RED);
        gc.fillOval(player.getX()*d, player.getY()*d, d, d);
    }

    public void start() {
        player = new Player(15,15);
    }

    public void step() {
        player.move();
    }

    public void turn(Direction direction) {
        player.setDirection(direction);
    }
}
