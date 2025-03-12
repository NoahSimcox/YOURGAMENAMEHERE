package game;

import java.awt.*;
import java.awt.event.KeyListener;
import java.nio.file.attribute.PosixFileAttributes;

public class TetrisBlock extends Polygon implements KeyListener {

    private Block[] blocks;
    private BlockShape blockShape;
    private Color color;

    public TetrisBlock(Block[] blocks, BlockShape blockShape, Color color, Point position, double rotation){
        super(blockShape.getPoints(), position, rotation);

        this.blocks = blocks;
        this.blockShape = blockShape;
        this.color = color;
    }

}
