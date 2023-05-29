public class West implements Orientation {
    @Override
    public Orientation turnLeft() {
        return new South();
    }

    @Override
    public Orientation turnRight() {
        return new North();
    }

    @Override
    public Movement moveForward() {
        return new Movement(-1,0);
    }

    public String toString(){
        return "W";
    }
}
