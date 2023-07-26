import java.util.ArrayList;
import java.util.List;

public class MarsRover {

    private final Grid grid;
    private String direction = "N";

    public MarsRover(Grid grid) {
        this.grid = grid;
    }

    public String execute(String commands) {

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
                if (direction.equals("N")) grid.yCoordinate++;
                if (direction.equals("E")) grid.xCoordinate++;
                if (direction.equals("S")) {
                    grid.yCoordinate--;
                    if (grid.yCoordinate < 0) {
                        grid.yCoordinate = grid.MAX_HEIGHT - 1;
                    }
                }
                if (direction.equals("W")) {
                    grid.xCoordinate--;
                    if (grid.xCoordinate < 0) {
                        grid.xCoordinate = grid.MAX_WIDTH - 1;
                    }
                }
            }
        }
        return grid.xCoordinate + ":" + grid.yCoordinate + ":" + direction;
    }

    private String rotate(ArrayList directions) {
        int currentDirectionIndex = directions.indexOf(direction);
        direction = directions.get((currentDirectionIndex + 1) % directions.toArray().length).toString();
        return direction;
    }
}
