public class MarsRover {

    public static final String ROTATE_LEFT = "L";
    private static final String ROTATE_RIGHT = "R";
    public static final int MAX_HEIGHT = 10;
    public static final String MOVE = "M";
    public static final int MAX_WIDTH = 10;
    private Direction direction;

    public MarsRover() {
        this.direction = new Direction();
    }

    public String execute(String commands) {
        int YPosition = 0;
        int XPosition = 0;

        for (String command : commands.split("")) {
            if (command.equals(MOVE)) {
                if (direction.facingto().equals("N")) {
                    YPosition = (YPosition + 1) % MAX_HEIGHT;
                }
                if (direction.facingto().equals("S")) {
                    YPosition = YPosition - 1;
                    if (YPosition < 0) YPosition = MAX_HEIGHT - 1;
                }
                if (direction.facingto().equals("E")) {
                    XPosition = (XPosition + 1) % MAX_WIDTH;
                }
                if (direction.facingto().equals("W")) {
                    XPosition--;
                }
            }
            if (command.equals(ROTATE_RIGHT)) {
                direction.turnRight();
            }
            if (command.equals(ROTATE_LEFT)) {
                direction.turnLeft();
            }
        }
        return XPosition + ":" + YPosition + ":" + direction.facingto();
    }
}
