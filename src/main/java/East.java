public class East implements Orientation {
    @Override
    public Orientation turnLeft() {
        return new North();
    }

    @Override
    public Orientation turnRight() {
        return new South();
    }

    @Override
    public Movement moveForward() {
        return new Movement(1,0);
    }

    public String toString(){
        return "E";
    }
}
