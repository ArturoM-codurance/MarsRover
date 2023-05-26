public class MarsRover {

    public static final String ROTATE_LEFT = "L";

    public String execute(String command) {
        if(command.equals(ROTATE_LEFT+ROTATE_LEFT+ROTATE_LEFT)){
            return "0:0:E";
        }
        if(command.equals(ROTATE_LEFT+ROTATE_LEFT)){
            return "0:0:S";
        }
        if(command.equals(ROTATE_LEFT)){
            return "0:0:W";
        }
        return "0:0:N";
    }
}
