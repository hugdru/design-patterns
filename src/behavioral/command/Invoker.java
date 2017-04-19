package behavioral.command;

import java.util.LinkedList;

class Invoker {

    private LinkedList<ICommand> commandHistory = new LinkedList<>();
    private LinkedList<ICommand> undoHistory = new LinkedList<>();

    void submit(ICommand command) {
        command.execute();
        undoHistory.clear();
        commandHistory.push(command);
    }

    void undo() {
        ICommand command = commandHistory.remove();
        if (command == null) {
            return;
        }
        command.undo();
        undoHistory.add(command);
    }

    void redo() {
        ICommand command = undoHistory.remove();
        if (command == null) {
            return;
        }
        command.execute();
        commandHistory.push(command);
    }
}
