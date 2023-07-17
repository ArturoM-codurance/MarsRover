public class RotateRight {
    static final String ROTATE_RIGHT = "R";
    private final MarsRover marsRover;

    public RotateRight(MarsRover marsRover) {
        this.marsRover = marsRover;
    }

    void run(String command) {
        if (command.equals(ROTATE_RIGHT)) {

            if (marsRover.getOrientation().equals("N")) {
                marsRover.setOrientation("E");
                return;
            }
            if (marsRover.getOrientation().equals("E")) {
                marsRover.setOrientation("S");
                return;
            }
            if (marsRover.getOrientation().equals("S")) {
                marsRover.setOrientation("W");
                return;
            }
            if (marsRover.getOrientation().equals("W")) {
                marsRover.setOrientation("N");
                return;
            }
        }
    }
}