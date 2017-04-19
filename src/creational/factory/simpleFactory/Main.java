package creational.factory.simpleFactory;

class Main {
    public static void main(String[] args) {
        IDoor woodenDoor = DoorFactory.makeWoodenDoor(10, 40);
        woodenDoor.engrave();

        IDoor metalDoor = DoorFactory.makeMetalDoor(10, 40);
        metalDoor.engrave();

        woodenDoor = DoorFactory.makeDoor("wood", 10, 40);
        woodenDoor.engrave();

        metalDoor = DoorFactory.makeDoor("metal", 10, 40);
        metalDoor.engrave();

        try {
            DoorFactory.makeDoor("bamboo", 10, 40);
        } catch (Exception e) {
            System.err.println("Bad implementation does not respect open/close principle, ".concat(e.getMessage()));
            System.exit(1);
        }
    }
}