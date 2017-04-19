package creational.factoryMethod.skeleton;

class ConcreteCreatorA extends ACreator {
    @Override
    public AProduct FactoryMethod() {
        return new ConcreteProductA();
    }
}
