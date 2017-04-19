package creational.factory.simpleFactory;

/*
Bad implementation does not respect the open close principle
"The open/closed principle states software entities (classes, modules, functions, etc.)
should be open for extension, but closed for modification,
that is, such an entity can allow its behaviour to be extended without modifying its source code."
 */
class DoorFactory {
    static IDoor makeWoodenDoor(double width, double height) {
        return new WoodenDoor(width, height);
    }

    static IDoor makeMetalDoor(double width, double height) {
        return new MetalDoor(width, height);
    }

    static IDoor makeDoor(String doorType, double width, double height) {
        switch (doorType) {
            case "wood":
                return makeWoodenDoor(width, height);
            case "metal":
                return makeMetalDoor(width, height);
            default:
                throw new IllegalArgumentException("Door type not supported!");
        }
    }
}
