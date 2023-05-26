public class MarsRover {

    public static final String ROTATE_LEFT = "L";
    private static final String ROTATE_RIGHT = "R";
    private Direction direction;

    public MarsRover() {
        this.direction = new Direction();
    }

    public String execute(String commands) {
        int YPosition = 0;

        for (String command : commands.split("")) {
            if(command.equals("M")){
                if(direction.facingto().equals("N")){
                    YPosition = (YPosition + 1) % 10;
                }
                if(direction.facingto().equals("S")){
                    YPosition--;
                }
            }
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
