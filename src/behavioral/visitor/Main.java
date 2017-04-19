package behavioral.visitor;

class Main {
    public static void main(String[] args) {
        DolphinElement dolphinElement = new DolphinElement();
        IAnimalElement lionElement = new LionElement();
        ApeElement apeElement = new ApeElement();

        IAnimalVisitor speakVisitor = new SpeakVisitor();
        dolphinElement.accept(speakVisitor);
        lionElement.accept(speakVisitor);
        apeElement.accept(speakVisitor);

        System.out.println();
        IAnimalVisitor attackVisitor = new IAnimalVisitor() {
            @Override
            public void visit(DolphinElement dolphinElement) {
                System.out.println("CLICK CLICK CLICK");
            }

            @Override
            public void visit(LionElement lionElement) {
                System.out.println("ROAR ROAR ROAR");
            }

            @Override
            public void visit(ApeElement monkeyElement) {
                System.out.println("WON SI SEPA FO TENALP");
            }
        };

        dolphinElement.accept(attackVisitor);
        lionElement.accept(attackVisitor);
        apeElement.accept(attackVisitor);
    }
}
