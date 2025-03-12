package game;

import java.awt.*;

public class BombBlock extends Polygon {

    private Block[] blocks;
    private BlockShape blockShape = BlockShape.BLOCKER_AND_BOMB_SHAPE;
    private Color color = Color.RED;
    private int blastRadius;

    public BombBlock(int blastRadius, Block[] blocks,BlockShape blockShape, Point position, double rotation){
        super(blockShape.getPoints(), position, rotation);

        this.blastRadius = blastRadius;
        this.blocks = blocks;
    }

    public void explode(){

    }
}