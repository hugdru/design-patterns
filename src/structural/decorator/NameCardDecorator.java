package structural.decorator;

class NameCardDecorator extends ADecorator {

    protected double discount = 5.0;

    public NameCardDecorator(ABakeryComponent bakeryComponent) {
        super(bakeryComponent, "Name Card", 4.0);
    }

    @Override
    public String toString() {
        return super.getName() +
                "\nTotal: " + this.price +
                "\n(Please Collect your discount card for " + discount + ")";
    }
}
