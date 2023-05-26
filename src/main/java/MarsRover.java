public class MarsRover {

    public static final String ROTATE_LEFT = "L";
    private static final String ROTATE_RIGHT = "R";

    public String execute(String commands) {
        String coordinates = "0:0:";
        Direction direction = Direction.NORTH;

        for (String command : commands.split("")) {
            if (command.equals(ROTATE_RIGHT)) {
                direction = turnRight(direction);
            }
            if (command.equals(ROTATE_LEFT)) {
                direction = turnLeft(direction);
            }
        }
        return coordinates + direction.getValue();
    }

    private static Direction turnRight(Direction currentDirection) {
        switch (currentDirection) {
            case NORTH -> {
                return Direction.EAST;
            }
            case EAST -> {
                return Direction.SOUTH;
            }
            case SOUTH -> {
                return Direction.WEST;
            }
            default -> {
                return Direction.NORTH;
            }
        }
    }

    private static Direction turnLeft(Direction currentDirection) {
        switch (currentDirection) {
            case NORTH -> {
                return Direction.WEST;
            }
            case EAST -> {
                return Direction.NORTH;
            }
            case SOUTH -> {
                return Direction.EAST;
            }
            default -> {
                return Direction.SOUTH;
            }
        }
    }
}
