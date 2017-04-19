package creational.factory.reflectionFactory.manualRegistration;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

class DoorFactory {

    private HashMap<String, Class> registeredDoors = new HashMap<>();

    void registerDoor(String doorType, Class<?> doorClass) {
        registeredDoors.put(doorType, doorClass);
    }

    IDoor makeDoor(String doorType, double width, double height) throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {

        Class doorClass = registeredDoors.get(doorType);
        if (doorClass == null) {
            throw new IllegalArgumentException("Register the Door implementation before making it");
        }

        Constructor<?> doorConstructor = doorClass.getDeclaredConstructor(double.class, double.class);
        return (IDoor) doorConstructor.newInstance(width, height);
    }
}
