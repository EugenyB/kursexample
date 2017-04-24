package model;

import java.util.Objects;

/**
 * Created by eugen on 24.04.2017.
 */
public abstract class GameObject {
    private int x;
    private int y;

    public GameObject(int x, int y) {
        this.setX(x);
        this.setY(y);
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GameObject)) return false;
        GameObject that = (GameObject) o;
        return x == that.x &&
                y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public void setPosition(Position pos) {
        x = pos.getX();
        y = pos.getY();
    }

    public Position getPosition() {
        return new Position(x,y);
    }

    public abstract void move();
}
