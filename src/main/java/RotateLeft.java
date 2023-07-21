public class RotateLeft {
    public static final String ROTATE_LEFT = "L";

    public RotateLeft() {
    }

    void run(String command, Orientation orientation) {
        if (command.equals(ROTATE_LEFT)) {
            orientation.rotateLeft();
        }
    }
}