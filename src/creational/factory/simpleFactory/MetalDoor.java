package creational.factory.simpleFactory;

class MetalDoor implements IDoor {
    private double width;
    private double height;

    MetalDoor(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getWidth() {
        return this.width;
    }

    @Override
    public double getHeight() {
        return this.height;
    }

    @Override
    public void engrave() {
        System.out.println("The metal door was engraved with a symbol");
    }
}
