public class Movement {
    private final int xInt;
    private final int yInt;

    public Movement(int xInt, int yint) {
        this.xInt = xInt;
        yInt = yint;
    }

    public int x() {
        return xInt;
    }

    public int y() {
        return yInt;
    }
}