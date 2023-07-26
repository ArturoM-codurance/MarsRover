import java.util.List;

public class Grid {

    public int MAX_HEIGHT;
    public int MAX_WIDTH;
    public int xCoordinate;
    public int yCoordinate;
    public List<Integer> obstacles = List.of();

    public Grid( int maxHeight, int maxWidth, List<Integer> obstacles) {
        this.xCoordinate = 0;
        this.yCoordinate = 0;
        MAX_HEIGHT = maxHeight;
        MAX_WIDTH = maxWidth;
        this.obstacles = obstacles;
    }
}
