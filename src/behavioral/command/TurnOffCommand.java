package behavioral.command;

class TurnOffCommand implements ICommand {

    BulbReceiver bulb;

    TurnOffCommand(BulbReceiver bulb) {
        this.bulb = bulb;
    }

    @Override
    public void execute() {
        this.bulb.turnOff();
    }

    @Override
    public void undo() {
        this.bulb.turnOn();
    }
}
