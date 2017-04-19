package creational.abstractFactory.skeleton;

class Main {
    public static void main(String[] args) {
        AbstractFactory factory1 = new ConcreteFactory1();
        factory1.createProductB().interact(factory1.createProductA());

        AbstractFactory factory2 = new ConcreteFactory2();
        factory2.createProductB().interact(factory2.createProductA());
    }
}
