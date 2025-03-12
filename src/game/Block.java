package game;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Block implements Destroyable{

    private Point boardLocation;
    private Color color;

    public Block(Point location, Color color){

        double pointX = (location.x - 3)/25;
        double pointY = (location.y - 3)/25;

        boardLocation.x = pointX;
        boardLocation.y = pointY;

        this.color = color;
    }

    public Point getBoardLocation(){return boardLocation;}


    // Checks if row was cleared by filling it with 10 blocks
    public ArrayList<Block> destroy(ArrayList<Block> blocks){

        // Create a HashMap to store the count of each x value
        HashMap<Double, ArrayList<Block>> xBlockMap = new HashMap<>();
        ArrayList<Block> destroyedBlocks;

        for (Block block : blocks) {
            double x = block.boardLocation.x;

            xBlockMap.putIfAbsent(x, new ArrayList<>());
            xBlockMap.get(x).add(block);

            if (xBlockMap.get(x).size() == 10) {
                return xBlockMap.get(x);
            }
        }

        return null;
    }
}
