public class MoveForwards {
    public static final String MOVE = "M";
    private final MarsRover marsRover;

    public MoveForwards(MarsRover marsRover) {
        this.marsRover = marsRover;
    }

    void run(String command) {
        if (command.equals(MOVE)) {

            if (marsRover.getOrientation().equals("N")) {
                marsRover.setY(marsRover.getY() + 1);
            }
            if (marsRover.getOrientation().equals("E")) {
                marsRover.setX(marsRover.getX() + 1);
            }
            if (marsRover.getOrientation().equals("S")) {
                marsRover.setY(marsRover.getY() - 1);
            }
            if (marsRover.getOrientation().equals("W")) {
                marsRover.setX(marsRover.getX() - 1);
            }

            marsRover.setX((marsRover.getX() + MarsRover.MAX_X) % MarsRover.MAX_X);
            marsRover.setY((marsRover.getY() + MarsRover.MAX_Y) % MarsRover.MAX_Y);
        }
    }
}