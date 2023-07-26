import java.util.ArrayList;
import java.util.List;

public class MarsRover {

    private static final int MAX_HEIGHT = 10;
    private static final int MAX_WIDTH = 10;
    private String direction = "N";

    public String execute(String commands) {
        int XCoordinate = 0;
        int YCoordinate = 0;

        for (char command : commands.toCharArray()) {

            if (command == 'L') {
                ArrayList directionsCounterClockwise = new ArrayList<>(List.of("N", "W", "S", "E"));
                direction = rotate(directionsCounterClockwise);
            }

            if (command == 'R') {
                ArrayList directionsClockwise = new ArrayList<>(List.of("N", "E", "S", "W"));
                direction = rotate(directionsClockwise);
            }

            if (command == 'M') {
                if (direction.equals("N")) YCoordinate++;
                if (direction.equals("E")) XCoordinate++;
                if (direction.equals("S")) {
                    YCoordinate--;
                    if (YCoordinate < 0) {
                        YCoordinate = MAX_HEIGHT - 1;
                    }
                }
                if (direction.equals("W")) {
                    XCoordinate--;
                    if (XCoordinate < 0) {
                        XCoordinate = MAX_WIDTH - 1;
                    }
                }
            }
        }
        return XCoordinate + ":" + YCoordinate + ":" + direction;
    }

    private String rotate(ArrayList directions) {
        int currentDirectionIndex = directions.indexOf(direction);
        direction = directions.get((currentDirectionIndex + 1) % directions.toArray().length).toString();
        return direction;
    }
}
