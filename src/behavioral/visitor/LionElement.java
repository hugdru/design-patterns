package behavioral.visitor;

class LionElement implements IAnimalElement {
    @Override
    public void accept(IAnimalVisitor visitor) {
        visitor.visit(this);
    }
}
