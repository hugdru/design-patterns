package structural.decorator;

abstract class ABakeryComponent {
    protected String name;
    protected double price;

    public ABakeryComponent(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return this.name +
                "\nTotal: " + this.price;
    }
}
