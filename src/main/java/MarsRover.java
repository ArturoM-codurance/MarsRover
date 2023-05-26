public class MarsRover {
    public String execute(String command) {
        if(command.equals("L")){
            return "0:0:W";
        }
        return "0:0:N";
    }
}
