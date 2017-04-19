package creational.factory.reflectionFactory.automaticRegistration;

class WoodenDoor implements IDoor {

    public static final String type = "wood";
    private double width;
    private double height;

    WoodenDoor(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public static void register() {
        DoorFactory.getInstance().registerDoor(type, WoodenDoor.class);
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
        System.out.println("The wooden door was engraved with a symbol");
    }
}
