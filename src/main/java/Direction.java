public enum Direction {
    NORTH("N"),
    SOUTH("S"),
    EAST("E"),
    WEST("W");

    private final String value;

    Direction(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public Direction turnRight(Direction currentDirection) {
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

    public Direction turnLeft(Direction currentDirection) {
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
