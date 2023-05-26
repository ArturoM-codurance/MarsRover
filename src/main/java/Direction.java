public class Direction {

    public static final String NORTH = "N";
    public static final String EAST = "E";
    public static final String SOUTH = "S";
    public static final String WEST = "W";
    private  String currentDirection;

    Direction() {
        this.currentDirection = "N";
    }

    public String facingto() {
        return currentDirection;
    }

    public void turnRight() {
        switch (currentDirection) {
            case NORTH -> {
                currentDirection = EAST;
            }
            case EAST -> {
                currentDirection = SOUTH;
            }
            case SOUTH -> {
                currentDirection = WEST;
            }
            default -> {
                currentDirection = NORTH;
            }
        }
    }

    public void turnLeft() {
        switch (currentDirection) {
            case NORTH -> {
                currentDirection = WEST;
            }
            case EAST -> {
                currentDirection = NORTH;
            }
            case SOUTH -> {
                currentDirection = EAST;
            }
            default -> {
                currentDirection = SOUTH;
            }
        }
    }
}
