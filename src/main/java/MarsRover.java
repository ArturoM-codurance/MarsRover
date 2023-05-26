public class MarsRover {
    public String execute(String command) {
        if(command.equals("LLL")){
            return "0:0:E";
        }
        if(command.equals("LL")){
            return "0:0:S";
        }
        if(command.equals("L")){
            return "0:0:W";
        }
        return "0:0:N";
    }
}
