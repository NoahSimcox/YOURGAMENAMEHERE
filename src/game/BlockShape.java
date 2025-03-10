package game;

public enum BlockShape {

    //TODO: change points to be not (0,0)

    I_SHAPE(new Point[]{new Point(0, 0)}),
    S_SHAPE(new Point[]{new Point(0, 0)}),
    T_SHAPE(new Point[]{new Point(0, 0)}),
    Z_SHAPE(new Point[]{new Point(0, 0)}),
    O_SHAPE(new Point[]{new Point(0, 0)}),
    L_SHAPE(new Point[]{new Point(0, 0)}),
    J_SHAPE(new Point[]{new Point(0, 0)}),
    BLOCKER_SHAPE(new Point[]{new Point(0, 0)});

    Point[] points;

    BlockShape(Point[] points) {
        this.points = points;
    }

    public Point[] getPoints(){
        return points.clone();
    }


    public BlockShape randomBlockShape(){
        //TODO: implement this method using chatgpt it told me what to do
        return null;
    }
}
