package creational.factory.avoidReflectionFactory;

interface IDoor {
    double getWidth();

    double getHeight();

    void engrave();

    IDoor createDoor(double width, double height);
}
