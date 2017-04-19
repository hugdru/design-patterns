package structural.flyweight;

class Main {

    public static void main(String[] args) {
        SoldierUnit.register();
        EliteUnit.register();

        AClient soldier1 = new SoldierClient(1, 2, 3);
        AClient soldier2 = new SoldierClient(3, 1, 2);
        AClient soldier3 = new SoldierClient(2, 3, 1);

        AClient elite1 = new EliteClient(2, 3, 1);
        AClient elite2 = new EliteClient(3, 1, 2);
        AClient elite3 = new EliteClient(1, 2, 3);

        soldier1.move(0, 0, 0);
        soldier2.move(1, 1, 1);
        soldier3.move(2, 2, 2);

        elite1.move(3, 3, 3);
        elite2.move(4, 4, 4);
        elite3.move(5, 5, 5);
    }
}
