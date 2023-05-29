public class MarsRover {

    public static final String ROTATE_LEFT = "L";
    private static final String ROTATE_RIGHT = "R";
    public static final String MOVE = "M";


    private Orientation orientation;
    private Coordinates position;


    public MarsRover() {
        this.orientation = new North();
        this.position = new Coordinates(0,0);
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
        position.updatePosition(movement);
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
