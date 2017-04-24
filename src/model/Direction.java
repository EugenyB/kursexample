package model;

/**
 * Created by eugen on 24.04.2017.
 */
public interface Direction {
    Position next(Position current);

    Direction NORTH = p -> new Position(p.getX(), p.getY()-1);
    Direction SOUTH = p -> new Position(p.getX(), p.getY()+1);
    Direction EAST = p -> new Position(p.getX()+1, p.getY());
    Direction WEST = p -> new Position(p.getX()-1, p.getY());
}
