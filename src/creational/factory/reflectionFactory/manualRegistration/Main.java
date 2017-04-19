package creational.factory.reflectionFactory.manualRegistration;

class Main {
    public static void main(String[] args) {
        DoorFactory doorFactory = new DoorFactory();

        doorFactory.registerDoor("wood", WoodenDoor.class);
        doorFactory.registerDoor("metal", MetalDoor.class);

        try {
            IDoor woodenDoor = doorFactory.makeDoor("wood", 10, 40);
            IDoor metalDoor = doorFactory.makeDoor("metal", 10, 40);
            woodenDoor.engrave();
            metalDoor.engrave();
        } catch (Exception e) {
            System.err.println("You have to register door first by calling registerDoor");
            e.printStackTrace();
            System.exit(1);
        }
    }
}