package game;

public enum BlockShape {

    I_SHAPE(new Point[]{new Point(103, 3), new Point(103, 28), new Point(103, 53), new Point(103, 78)}),
    S_SHAPE(new Point[]{new Point(103, 3), new Point(128, 3), new Point(78, 28), new Point(103, 28)}),
    T_SHAPE(new Point[]{new Point(103, 3), new Point(78,28 ), new Point(103, 28), new Point(128, 28)}),
    Z_SHAPE(new Point[]{new Point(78, 3), new Point(103, 3), new Point(103, 28), new Point(128,28 )}),
    O_SHAPE(new Point[]{new Point(103, 3), new Point(128, 3),new Point(103, 28),new Point(128, 28)}),
    L_SHAPE(new Point[]{new Point(103, 3), new Point(103, 28),new Point(103, 53),new Point(128, 53)}),
    J_SHAPE(new Point[]{new Point(128, 3), new Point(128, 28),new Point(128, 53),new Point(103, 53)}),
    BLOCKER_AND_BOMB_SHAPE(new Point[]{new Point(0, 0)});

    private final Point[] points;

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