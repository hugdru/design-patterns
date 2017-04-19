package creational.factoryMethod.skeleton;

class ConcreteCreatorB extends ACreator {
    @Override
    public AProduct FactoryMethod() {
        return new ConcreteProductB();
    }
}
