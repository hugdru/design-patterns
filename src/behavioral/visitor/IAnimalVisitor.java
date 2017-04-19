package behavioral.visitor;

interface IAnimalVisitor {
    void visit(DolphinElement dolphinElement);

    void visit(LionElement lionElement);

    void visit(ApeElement apeElement);
}
