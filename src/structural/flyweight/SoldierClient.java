package structural.flyweight;

class SoldierClient extends AClient {

    public SoldierClient() {
        super(UnitFactory.make(SoldierUnit.name));
    }

    public SoldierClient(int x, int y, int z) {
        super(x, y, z, UnitFactory.make(SoldierUnit.name));
    }

    public SoldierClient(Position position) {
        super(position, UnitFactory.make(SoldierUnit.name));
    }

}
