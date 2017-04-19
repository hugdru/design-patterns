package creational.factory.reflectionFactory.automaticRegistration;

class MetalDoor implements IDoor {

    public static final String type = "metal";
    private double width;
    private double height;

    MetalDoor(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public static void register() {
        DoorFactory.getInstance().registerDoor(type, MetalDoor.class);
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
