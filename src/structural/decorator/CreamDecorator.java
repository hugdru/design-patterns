package structural.decorator;

class CreamDecorator extends ADecorator {
    public CreamDecorator(ABakeryComponent bakeryComponent) {
        super(bakeryComponent, "Cream", 1.0);
    }
}
