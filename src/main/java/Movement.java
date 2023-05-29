public class Movement {
    private final int xInt;
    private final int yInt;

    public Movement(int xInt, int yInt) {
        this.xInt = xInt;
        this.yInt = yInt;
    }

    public int x() {
        return xInt;
    }

    public int y() {
        return yInt;
    }
}
