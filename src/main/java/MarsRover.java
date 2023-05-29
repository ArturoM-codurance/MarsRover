public class MarsRover {

    public static final String ROTATE_LEFT = "L";
    private static final String ROTATE_RIGHT = "R";
    public static final String MOVE = "M";


    private Orientation orientation;
    private Coordinate position ;


    private int XPosition;
    private int YPosition;
    private Grid grid;

    public MarsRover() {
        this.orientation = new North();
        this.position = new Coordinate(0,0);
        this.XPosition = 0;
        this.YPosition = 0;
    }

    public String execute(String commands) {

        for (String command : commands.split("")) {
            if (command.equals(MOVE)) {
                moveForward();
            }
            if (command.equals(ROTATE_RIGHT)) {
                turnRight();
            }
            if (command.equals(ROTATE_LEFT)) {
                turnLeft();
            }
        }
        return buildOutput();
    }

    private void moveForward() {
        Movement movement = orientation.moveForward();

        position = new Coordinate(position.getX() + movement.x(), position.getY() + movement.y());
//        XPosition += movement.x();
//        YPosition += movement.y();
    }

    private String buildOutput() {
        return position.getX() + ":" + position.getY() + ":" + orientation;
    }


    public void turnRight() {
        orientation = orientation.turnRight();
    }

    public void turnLeft() {
        orientation = orientation.turnLeft();
    }
}
