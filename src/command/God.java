package command;

import java.util.Iterator;
import java.util.Stack;

public class God {
    private Stack<Command> commands = new Stack<Command>();

    public void addCommand(Command command) {
        commands.push(command);
    }

    public void undoCommand() {
        Command command = (Command) commands.pop();
        System.out.println("時よ戻れ～～～");
        command.execute();
        System.out.println("この行動はしてないことになったよ");
        }

    public void execute() {
        Iterator<Command> it = commands.iterator();
        while (it.hasNext()) {
            it.next().execute();
        }
    }
}
