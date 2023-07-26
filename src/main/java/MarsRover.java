import java.util.ArrayList;
import java.util.List;

public class MarsRover {

    private final Grid grid;
    private String direction = "N";

    private List<Integer> obstaclesInXFound = new ArrayList<>();

    private List<Integer> obstaclesInYFound = new ArrayList<>();

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
                if (grid.obstacles.size() > 0) {
                    Integer x = grid.obstacles.get(0);
                    Integer y = grid.obstacles.get(1);

                    List<Integer> nextCoordinate = resolveNextStep(grid.xCoordinate, grid.yCoordinate);

                    int nextX = nextCoordinate.get(0);
                    int nextY = nextCoordinate.get(1);

                    if (x == nextX) {
                        this.obstaclesInXFound.add(nextX);
                    }

                    this.obstaclesInYFound.add(nextY);
                }

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

        if (this.obstaclesInXFound.size() > 0) {
            int x = this.obstaclesInXFound.get(1);
            int y = this.obstaclesInYFound.get(1);

            return "O:" + x + ":" + y + ":" + direction;
        }

        return grid.xCoordinate + ":" + grid.yCoordinate + ":" + direction;
    }

    private List<Integer> resolveNextStep(int currentX, int currentY) {
        if (direction.equals("N")) currentY++;
        if (direction.equals("E")) currentX++;
        if (direction.equals("S")) {
            currentY--;
            if (currentY < 0) {
                currentY = grid.MAX_HEIGHT - 1;
            }
        }
        if (direction.equals("W")) {
            currentX--;
            if (currentX < 0) {
                currentX = grid.MAX_WIDTH - 1;
            }
        }

        return List.of(currentX, currentY);
    }

    private String rotate(ArrayList directions) {
        int currentDirectionIndex = directions.indexOf(direction);
        direction = directions.get((currentDirectionIndex + 1) % directions.toArray().length).toString();
        return direction;
    }
}
