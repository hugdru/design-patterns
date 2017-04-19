package structural.decorator;

abstract class ADecorator extends ABakeryComponent {
    protected ABakeryComponent bakeryComponent;

    public ADecorator(ABakeryComponent bakeryComponent, String name, Double price) {
        super(String.format("%s, %s", bakeryComponent.getName(), name), bakeryComponent.getPrice() + price);
        this.bakeryComponent = bakeryComponent;
    }
}
