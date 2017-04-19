package creational.factory.reflectionFactory.automaticRegistration;

class Main {
    static {
        WoodenDoor.register();
        MetalDoor.register();
    }

    public static void main(String[] args) {
        try {
            DoorFactory doorFactorySingleton = DoorFactory.getInstance();
            IDoor woodenDoor = doorFactorySingleton.makeDoor("wood", 10, 40);
            IDoor metalDoor = doorFactorySingleton.makeDoor("metal", 10, 40);
            woodenDoor.engrave();
            metalDoor.engrave();
        } catch (Exception e) {
            System.err.println("You have to register door first by calling registerDoor");
            e.printStackTrace();
            System.exit(1);
        }
    }
}