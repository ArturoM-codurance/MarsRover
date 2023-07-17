public class RotateLeft {
    public static final String ROTATE_LEFT = "L";
    private final MarsRover marsRover;

    public RotateLeft(MarsRover marsRover) {
        this.marsRover = marsRover;
    }

    void run(String command) {
        if (command.equals(ROTATE_LEFT)) {
            if (marsRover.getOrientation().equals("N")) {
                marsRover.setOrientation("W");
                return;
            }
            if (marsRover.getOrientation().equals("E")) {
                marsRover.setOrientation("N");
                return;
            }
            if (marsRover.getOrientation().equals("S")) {
                marsRover.setOrientation("E");
                return;
            }
            if (marsRover.getOrientation().equals("W")) {
                marsRover.setOrientation("S");
                return;
            }
        }
    }
}