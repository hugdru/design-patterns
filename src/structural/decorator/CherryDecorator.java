package structural.decorator;

class CherryDecorator extends ADecorator {
    public CherryDecorator(ABakeryComponent bakeryComponent) {
        super(bakeryComponent, "Cherry", 2.0);
    }
}
