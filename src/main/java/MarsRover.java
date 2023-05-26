public class MarsRover {

    public static final String ROTATE_LEFT = "L";
    private static final String ROTATE_RIGHT = "R";
    private Direction direction;

    public MarsRover() {
        this.direction = new Direction();
    }

    public String execute(String commands) {
        String YPosition = "0";
        if (commands.equals("M")) {
            YPosition = "1";
        }
        if (commands.equals("MM")) {
            YPosition = "2";
        }
        if (commands.equals("MMM")) {
            YPosition = "3";
        }

        for (String command : commands.split("")) {
            if (command.equals(ROTATE_RIGHT)) {
                direction.turnRight();
            }
            if (command.equals(ROTATE_LEFT)) {
                direction.turnLeft();
            }
        }
        return "0:" + YPosition + ":" + direction.facingto();
    }
}
