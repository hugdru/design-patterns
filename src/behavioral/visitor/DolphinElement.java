package behavioral.visitor;

class DolphinElement implements IAnimalElement {
    @Override
    public void accept(IAnimalVisitor visitor) {
        visitor.visit(this);
    }
}
