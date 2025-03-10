package game;

import java.awt.*;
import java.nio.file.attribute.PosixFileAttributes;

public class TetrisBlock extends Polygon{

    private BlockShape blockShape;
    private Color color;

    public TetrisBlock(BlockShape blockShape, Color color, Point position, double rotation){
        super(blockShape.getPoints(), position, rotation);

        this.blockShape = blockShape;
        this.color = color;
    }

}
