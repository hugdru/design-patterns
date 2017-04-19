package creational.abstractFactory.simple;

class Main {
    public static void main(String[] args) {
        AContinentFactory africaFactory = new AfricaFactory();
        africaFactory.createCarnivore().eat(africaFactory.createHerbivore());

        AContinentFactory americaFactory = new AmericaFactory();
        americaFactory.createCarnivore().eat(americaFactory.createHerbivore());
    }
}
