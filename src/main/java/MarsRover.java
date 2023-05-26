public class MarsRover {

    public static final String ROTATE_LEFT = "L";
    private static final String ROTATE_RIGHT = "R";
    private Direction direction;

    public MarsRover() {
        this.direction = new Direction();
    }

    public String execute(String commands) {
        String coordinates = "0:0:";
        if(commands.equals("M")){
            return "0:1:N";
        }

        for (String command : commands.split("")) {
            if (command.equals(ROTATE_RIGHT)) {
                direction.turnRight();
            }
            if (command.equals(ROTATE_LEFT)) {
                direction.turnLeft();
            }
        }
        return coordinates + direction.facingto();
    }
}
