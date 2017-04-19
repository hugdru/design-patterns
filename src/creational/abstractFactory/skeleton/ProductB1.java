package creational.abstractFactory.skeleton;

class ProductB1 extends AbstractProductB {
    @Override
    public void interact(AbstractProductA productA) {
        System.out.println(this.getClass().getSimpleName() + " interacts with " + productA.getClass().getSimpleName());
    }
}
