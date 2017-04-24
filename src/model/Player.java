package model;

/**
 * Created by eugen on 24.04.2017.
 */
public class Player extends GameObject {
    private Direction dir = Direction.NORTH;

    public Player(int x, int y) {
        super(x, y);
    }

    @Override
    public void move() {
        setPosition(dir.next(getPosition()));
    }


    public void setDirection(Direction direction) {
        this.dir = direction;
    }
}
