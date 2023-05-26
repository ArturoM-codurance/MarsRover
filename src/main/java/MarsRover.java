public class MarsRover {

    public static final String ROTATE_LEFT = "L";
    private static final String ROTATE_RIGHT = "R";
    private Direction direction = Direction.NORTH;


    public String execute(String commands) {
        String coordinates = "0:0:";

        for (String command : commands.split("")) {
            if (command.equals(ROTATE_RIGHT)) {
                direction = direction.turnRight(direction);
            }
            if (command.equals(ROTATE_LEFT)) {
                direction = direction.turnLeft(direction);
            }
        }
        return coordinates + direction.getValue();
    }
}
