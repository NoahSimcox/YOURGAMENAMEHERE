package game;

import java.awt.*;

public class Block extends Polygon {

    private Point boardLocation;

    public Block(Point[] shape, Point position, double rotation){
        super(shape, position, rotation);

        double pointX = (shape[0].x - 3)/25;
        double pointY = (shape[0].y - 3)/25;

        boardLocation.x = pointX;
        boardLocation.y = pointY;
    }
}
