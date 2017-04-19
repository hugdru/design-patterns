package creational.factory.avoidReflectionFactory;

import java.util.HashMap;

class DoorFactory {

    private static DoorFactory instance = new DoorFactory();

    private HashMap<String, IDoor> registeredDoors = new HashMap<>();

    static DoorFactory getInstance() {
        return instance;
    }

    void registerDoor(String doorType, IDoor door) {
        registeredDoors.put(doorType, door);
    }

    IDoor makeDoor(String doorType, double width, double height) {

        IDoor door = registeredDoors.get(doorType);
        if (door == null) {
            throw new IllegalArgumentException("Register the Door implementation before making it");
        }

        return door.createDoor(width, height);
    }
}
