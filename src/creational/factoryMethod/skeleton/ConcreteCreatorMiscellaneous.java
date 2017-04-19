package creational.factoryMethod.skeleton;

class ConcreteCreatorMiscellaneous extends ACreator {
    @Override
    public AProduct FactoryMethod() {
        return new ConcreteProductA();
    }
}
