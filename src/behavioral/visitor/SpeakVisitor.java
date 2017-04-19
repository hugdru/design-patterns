package behavioral.visitor;

class SpeakVisitor implements IAnimalVisitor {
    @Override
    public void visit(DolphinElement dolphinElement) {
        System.out.println("click click click");
    }

    @Override
    public void visit(LionElement lionElement) {
        System.out.println("roar roar roar");
    }

    @Override
    public void visit(ApeElement apeElement) {
        System.out.println("won si sepa fo tenalp");
    }
}
