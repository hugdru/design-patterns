package behavioral.visitor;

class ApeElement implements IAnimalElement {
    @Override
    public void accept(IAnimalVisitor visitor) {
        visitor.visit(this);
    }
}
