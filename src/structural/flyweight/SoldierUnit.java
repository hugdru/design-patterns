package structural.flyweight;

class SoldierUnit implements IUnit {

    public static final String name = "soldier";

    private static SoldierUnit instance;

    private Object graphicalRepresentation;

    private SoldierUnit() {
    }

    public static void register() {
        if (instance == null) {
            synchronized (SoldierUnit.class) {
                if (instance == null) {
                    instance = new SoldierUnit();
                }
            }
        }
        UnitFactory.register(SoldierUnit.name, instance);
    }

    @Override
    public void move(AClient client, Position newPosition) {
        client.setPosition(newPosition);
    }

    @Override
    public void move(AClient client, int x, int y, int z) {
        client.setPosition(x, y, z);
    }

    @Override
    public void draw() {
        System.out.println(this.name + " has been drawn");
    }
}
