package structural.flyweight;

import java.util.HashMap;

class UnitFactory {
    private static HashMap<String, IUnit> registered = new HashMap<>();

    private UnitFactory() {
    }

    public static void register(String unitName, IUnit unit) {
        registered.put(unitName, unit);
    }

    public static IUnit make(String name) {
        return registered.get(name);
    }
}
