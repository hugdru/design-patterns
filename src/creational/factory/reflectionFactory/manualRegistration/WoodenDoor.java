package creational.factory.reflectionFactory.manualRegistration;

class WoodenDoor implements IDoor {
    private double width;
    private double height;

    WoodenDoor(double width, double height) {
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
        System.out.println("The wooden door was engraved with a symbol");
    }
}
