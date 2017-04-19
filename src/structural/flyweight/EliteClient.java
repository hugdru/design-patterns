package structural.flyweight;

class EliteClient extends AClient {

    public EliteClient() {
        super(UnitFactory.make(EliteUnit.name));
    }

    public EliteClient(int x, int y, int z) {
        super(x, y, z, UnitFactory.make(EliteUnit.name));
    }

    public EliteClient(Position position) {
        super(position, UnitFactory.make(EliteUnit.name));
    }
}
