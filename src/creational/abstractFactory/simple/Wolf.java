package creational.abstractFactory.simple;

class Wolf extends ACarnivore {
    @Override
    public void eat(AHerbivore herbivore) {
        System.out.println(this.getClass().getSimpleName() + " eats " + herbivore.getClass().getSimpleName());
    }
}
