package creational.prototype;

interface IComputerPrototype {
    IComputerPrototype copy();

    String getType();

    String getModel();
}
