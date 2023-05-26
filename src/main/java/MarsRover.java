public class MarsRover {

    public static final String ROTATE_LEFT = "L";

    public String execute(String command) {
        String coordinates = "0:0:";
        String direction = "N";

        if(command.equals("R")){
            direction = "E";
        }
        if(command.equals("RR")){
            direction = "S";
        }
        if(command.equals(ROTATE_LEFT+ROTATE_LEFT+ROTATE_LEFT)){
            direction = "E";
        }
        if(command.equals(ROTATE_LEFT+ROTATE_LEFT)){
            direction = "S";
        }
        if(command.equals(ROTATE_LEFT)){
            direction = "W";
        }
        return coordinates + direction;
    }
}
