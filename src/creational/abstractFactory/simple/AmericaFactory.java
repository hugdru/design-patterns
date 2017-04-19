package creational.abstractFactory.simple;

class AmericaFactory extends AContinentFactory {

    @Override
    public AHerbivore createHerbivore() {
        return new Bison();
    }

    @Override
    public ACarnivore createCarnivore() {
        return new Wolf();
    }
}