package creational.builder;

class Main {
    public static void main(String[] args) {
        Waiter waiter1 = new Waiter();
        waiter1.setPizzaBuilder(new HawaiianPizzaBuilder());
        waiter1.constructPizza();
        Pizza hawaiianPizza = waiter1.getPizza();

        waiter1.setPizzaBuilder(new SpicyPizzaBuilder());
        waiter1.constructPizza();
        Pizza spicyPizza = waiter1.getPizza();

        System.out.println(hawaiianPizza);
        System.out.println(spicyPizza);
    }
}
