public class South implements Orientation {
    @Override
    public Orientation turnLeft() {
        return new East();
    }

    @Override
    public Orientation turnRight() {
        return new West();
    }

    @Override
    public Movement moveForward() {
        return new Movement(0, -1);
    }

    public String toString(){
        return "S";
    }
}
