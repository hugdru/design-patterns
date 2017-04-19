package creational.abstractFactory.simple;

class AfricaFactory extends AContinentFactory {
    @Override
    public AHerbivore createHerbivore() {
        return new Wildebeest();
    }

    @Override
    public ACarnivore createCarnivore() {
        return new Lion();
    }
}