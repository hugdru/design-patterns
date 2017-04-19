package structural.flyweight;

abstract class AClient {
    protected Position position;
    protected IUnit unit;

    protected AClient(IUnit unit) {
        this.position = new Position(0, 0, 0);
        this.unit = unit;
    }

    protected AClient(int x, int y, int z, IUnit unit) {
        this.position = new Position(x, y, z);
        this.unit = unit;
    }

    protected AClient(Position position, IUnit unit) {
        this.position = position.copy();
        this.unit = unit;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position.set(position);
    }

    public void setPosition(int x, int y, int z) {
        this.position.set(x, y, z);
    }

    @Override
    public String toString() {
        return this.getClass().getName() + " is in position " + position.toString();
    }

    public void move(Position position) {
        this.unit.move(this, position);
    }

    public void move(int x, int y, int z) {
        this.unit.move(this, x, y, z);
    }
}
