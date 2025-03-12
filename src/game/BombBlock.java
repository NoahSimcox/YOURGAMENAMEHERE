package game;

import java.awt.*;
import java.util.ArrayList;

public class BombBlock extends Polygon {

    private Block[] blocks;
    private BlockShape blockShape = BlockShape.BLOCKER_AND_BOMB_SHAPE;
    private Color color = Color.RED;
    private int blastRadius;

    public BombBlock(int blastRadius, Block[] blocks,BlockShape blockShape, Point position, double rotation){
        super(blockShape.getPoints(), position, rotation);

        this.blocks = blocks;
    }


    Destroyable Explosion = new Destroyable() {

        public ArrayList<Block> destroy(ArrayList<Block> blocks) {

            ArrayList<Block> explodedBlocks = new ArrayList<>();
            Point center = blocks.getFirst().getBoardLocation();

            for (int x = (int) center.x - blastRadius; x <= center.x + blastRadius; x++) {
                for (int y = (int) center.y - blastRadius; y <= center.y + blastRadius; y++) {

                    explodedBlocks.add(new Block(new Point(x,y), null));
                }
            }

            return explodedBlocks;
        }
    };
}