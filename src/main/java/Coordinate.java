public class Coordinate {
    private int x;
    private int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
        if (x < 0) {
            this.x = x + 10;
        }
        if (x > 9) {
            this.x = x - 10;
        }
        if (y < 0) {
            this.y = y + 10;
        }
        if (y > 9) {
            this.y = y - 10;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
