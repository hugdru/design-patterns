package structural.flyweight;

class Position {

    public int x, y, z;

    public Position(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = y;
    }

    @Override
    public String toString() {
        return "Position{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    public Position copy() {
        return new Position(this.x, this.y, this.z);
    }

    public void set(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void set(Position position) {
        this.x = position.x;
        this.y = position.y;
        this.z = position.z;
    }
}
