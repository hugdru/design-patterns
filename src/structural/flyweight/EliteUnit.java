package structural.flyweight;

class EliteUnit implements IUnit {

    public static final String name = "elite";

    private static EliteUnit instance;

    private Object graphicalRepresention;

    private EliteUnit() {
    }

    public static void register() {
        if (instance == null) {
            synchronized (EliteUnit.class) {
                if (instance == null) {
                    instance = new EliteUnit();
                }
            }
        }
        UnitFactory.register(EliteUnit.name, instance);
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
