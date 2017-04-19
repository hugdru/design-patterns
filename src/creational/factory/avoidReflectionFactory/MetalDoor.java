package creational.factory.avoidReflectionFactory;

class MetalDoor implements IDoor {

    public static final String type = "metal";
    private double width;
    private double height;

    private MetalDoor() {
    }

    MetalDoor(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public static void register() {
        DoorFactory.getInstance().registerDoor(type, new MetalDoor());
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

    @Override
    public IDoor createDoor(double width, double height) {
        return new MetalDoor(width, height);
    }
}
