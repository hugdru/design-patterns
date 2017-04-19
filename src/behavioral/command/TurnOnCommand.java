package behavioral.command;

class TurnOnCommand implements ICommand {

    BulbReceiver bulb;

    TurnOnCommand(BulbReceiver bulb) {
        this.bulb = bulb;
    }

    @Override
    public void execute() {
        this.bulb.turnOn();
    }

    @Override
    public void undo() {
        this.bulb.turnOff();
    }
}
