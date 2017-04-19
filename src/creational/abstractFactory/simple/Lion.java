package creational.abstractFactory.simple;

class Lion extends ACarnivore {

    @Override
    public void eat(AHerbivore herbivore) {
        System.out.println(this.getClass().getSimpleName() + " eats " + herbivore.getClass().getSimpleName());
    }
}
