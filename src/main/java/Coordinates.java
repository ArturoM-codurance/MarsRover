public class Coordinates {
    public static final int MAX_Y = 10;
    public static final int MAX_X = 10;
    private int x;
    private int y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void updatePosition (Movement movement){

        this.x = (this.x + movement.x() + MAX_X) % MAX_X;
        this.y = (this.y + movement.y() + MAX_Y) % MAX_Y;

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
