package structural.flyweight;

interface IUnit {
    void move(AClient client, Position newPosition);

    void move(AClient client, int x, int y, int z);

    void draw();
}
