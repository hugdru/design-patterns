package creational.factoryMethod.skeleton;

class Main {
    public static void main(String[] args) {
        ACreator[] creators = new ACreator[]{new ConcreteCreatorA(), new ConcreteCreatorB(), new ConcreteCreatorMiscellaneous()};

        for (ACreator creator : creators) {
            AProduct product = creator.FactoryMethod();
            System.out.println("creator: " + creator.getClass().getSimpleName() + ", created: " + product.getClass().getSimpleName());
        }
    }
}
