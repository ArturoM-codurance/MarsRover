public class RotateRight {
    static final String ROTATE_RIGHT = "R";

    public RotateRight() {
    }

    void run(String command, Orientation orientation) {
        if (command.equals(ROTATE_RIGHT)) {
            orientation.rotateRight();
        }
    }
}