package structural.decorator;

class ArtificialScentDecorator extends ADecorator {
    ArtificialScentDecorator(ABakeryComponent bakeryComponent) {
        super(bakeryComponent, "Artificial Scent", 3.0);
    }
}
