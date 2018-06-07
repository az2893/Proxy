import java.util.ArrayList;
import java.util.List;

public class Waiter {
    private List<Command> commandList= new ArrayList<Command>();

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    private Command  command;

    public void Notify(){
        for (Command command:commandList) {
            command.ExcuteCommand();
        }

    }

    public void setOrder(Command command){

        commandList.add(command);

    }
}
