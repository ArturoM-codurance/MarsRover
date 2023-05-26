public class Grid {

    private int XPosition;
    private int YPosition;


    public static final int MAX_HEIGHT = 10;
    public static final int MAX_WIDTH = 10;

    public Grid() {
        XPosition = 0;
        YPosition = 0;
    }

    public void move(Direction direction){
        if (direction.facingto().equals("N")) {
            YPosition = (YPosition + 1) % MAX_HEIGHT;
        }
        if (direction.facingto().equals("S")) {
            YPosition = YPosition - 1;
            if (YPosition < 0) YPosition = MAX_HEIGHT - 1;
        }
        if (direction.facingto().equals("E")) {
            XPosition = (XPosition + 1) % MAX_WIDTH;
        }
        if (direction.facingto().equals("W")) {
            XPosition = XPosition - 1;
            if(XPosition < 0) XPosition = MAX_WIDTH - 1;
        }
    }


    public int currentXPosition() {
        return XPosition;
    }

    public int currentYPosition() {
        return YPosition;
    }
}
