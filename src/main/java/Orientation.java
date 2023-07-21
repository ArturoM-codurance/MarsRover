public class Orientation {
    private final String NORTH = "N";
    private final String EAST = "E";
    private final String WEST = "W";
    private final String SOUTH = "S";
    private String orientation;

    public Orientation() {
        this.orientation = NORTH;
    }

    public String getOrientation() {
        return orientation;
    }

    public String rotateRight(){
        if (orientation.equals(NORTH)) {
            return orientation = EAST;
        }
        if (orientation.equals(EAST)) {
            return orientation = SOUTH;
        }
        if (orientation.equals(SOUTH)) {
            return orientation = WEST;
        }
        if (orientation.equals(WEST)) {
            return orientation = NORTH;
        }
        return null;
    }
    public String rotateLeft(){
        if (orientation.equals(NORTH)) {
            return orientation = WEST;
        }
        if (orientation.equals(EAST)) {
            return orientation = NORTH;
        }
        if (orientation.equals(SOUTH)) {
            return orientation = EAST;
        }
        if (orientation.equals(WEST)) {
            return orientation = SOUTH;
        }
        return null;
    }
}