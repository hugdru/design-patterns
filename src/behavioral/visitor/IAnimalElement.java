package behavioral.visitor;

interface IAnimalElement {
    void accept(IAnimalVisitor visitor);
}
