package sample;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import model.Direction;
import model.GameField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public Pane pane;
    public Canvas canvas;

    GameField field;

    public void draw() {
        field.draw(canvas);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        field = new GameField();
        canvas.widthProperty().bind(pane.widthProperty());
        canvas.heightProperty().bind(pane.heightProperty());
        canvas.heightProperty().addListener(e -> draw());
        canvas.widthProperty().addListener(e -> draw());
        field.start();
    }

    public void step(ActionEvent actionEvent) {
        field.step();
        draw();
    }

    public void left(ActionEvent actionEvent) {
        field.turn(Direction.WEST);
    }

    public void right(ActionEvent actionEvent) {
        field.turn(Direction.EAST);
    }

    public void up(ActionEvent actionEvent) {
        field.turn(Direction.NORTH);
    }

    public void down(ActionEvent actionEvent) {
        field.turn(Direction.SOUTH);
    }
}
