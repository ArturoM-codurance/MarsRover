import java.util.ArrayList;
import java.util.List;

public class MarsRover {

    private String direction = "N";
    public String execute(String commands) {
        String coordinates = "0:0:";

        for (char command : commands.toCharArray()) {

            if (command == 'L') {
                ArrayList directionsCounterClockwise = new ArrayList<>(List.of("N", "W", "S", "E"));
                direction = rotate(directionsCounterClockwise);
            }

            if (command == 'R') {
                ArrayList directionsClockwise = new ArrayList<>(List.of("N", "E", "S", "W"));
                direction = rotate(directionsClockwise);
            }

        }

        return coordinates + direction;
    }

    private String rotate(ArrayList directions) {
        int currentDirectionIndex = directions.indexOf(direction);
        direction = directions.get((currentDirectionIndex + 1) % directions.toArray().length).toString();
        return direction;
    }
}
