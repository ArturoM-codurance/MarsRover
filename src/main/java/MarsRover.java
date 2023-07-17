public class MarsRover {

    static final int MAX_X = 10;
    static final int MAX_Y = 10;
    private static final String NORTH = "N";
    private static final String EAST = "E";
    private static final String WEST = "W";
    private static final String SOUTH = "S";
    private final RotateRight rotateRight = new RotateRight(this);
    private final RotateLeft rotateLeft = new RotateLeft(this);
    private final MoveForwards moveForwards = new MoveForwards(this);
    int y;
    int x;


    private String orientation;


    public MarsRover() {
        this.orientation = NORTH;
    }

    public String execute(String commands) {

        for (String command : commands.split("")) {
            moveForwards.run(command);
            rotateRight.run(command);
            rotateLeft.run(command);
        }
        return x + ":" + y + ":" + orientation;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
