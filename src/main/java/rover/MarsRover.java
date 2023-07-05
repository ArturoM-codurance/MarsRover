package rover;

public class MarsRover {

    public static final String ROTATE_LEFT = "L";
    private static final String ROTATE_RIGHT = "R";

    public static final String MOVE = "M";

    private Direction direction;
    private Grid grid;

    public MarsRover() {
        this.grid = new Grid();
        this.direction = new Direction();
    }

    public String execute(String commands) {

        for (String command : commands.split("")) {
            if (command.equals(MOVE)) {
                grid.move(direction);
            }
            if (command.equals(ROTATE_RIGHT)) {
                direction.turnRight();
            }
            if (command.equals(ROTATE_LEFT)) {
                direction.turnLeft();
            }
        }
        return grid.currentXPosition() + ":" + grid.currentYPosition() + ":" + direction.facingto();
    }
}
