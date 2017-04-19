package behavioral.command;

class Main {
    public static void main(String[] args) {
        BulbReceiver bulb = new BulbReceiver();
        TurnOffCommand turnOffCommand = new TurnOffCommand(bulb);
        TurnOnCommand turnOnCommand = new TurnOnCommand(bulb);

        Invoker invoker = new Invoker();
        invoker.submit(turnOffCommand);
        invoker.submit(turnOnCommand);
        invoker.undo();
        invoker.redo();
    }
}
