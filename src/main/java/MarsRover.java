public class MarsRover {

    static final int MAX_X = 10;
    static final int MAX_Y = 10;
    private Orientation orientation;
    private final RotateRight rotateRight;
    private final RotateLeft rotateLeft;
    private final MoveForwards moveForwards;
    int y;
    int x;


    public MarsRover() {
        orientation = new Orientation();
        rotateRight = new RotateRight();
        rotateLeft = new RotateLeft();
        moveForwards = new MoveForwards(this);
    }

    public String execute(String commands) {

        for (String command : commands.split("")) {
            moveForwards.run(command);
            rotateRight.run(command, orientation);
            rotateLeft.run(command, orientation);
        }
        return x + ":" + y + ":" + orientation.getOrientation();
    }

    public String getOrientation() {
        return orientation.getOrientation();
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
