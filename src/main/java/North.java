public class North implements Orientation {

    @Override
    public Orientation turnLeft() {

        return new West();
    }

    @Override
    public Orientation turnRight() {

        return new East();
    }

    @Override
    public Movement moveForward() {
        return new Movement(0,1);
    }

    public String toString(){
        return "N";
    }

}
