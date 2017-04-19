package structural.decorator;

class Main {
    public static void main(String[] args) {
        CakeBase cBase = new CakeBase();
        CreamDecorator creamCake = new CreamDecorator(cBase);
        CherryDecorator cherryCake = new CherryDecorator(creamCake);
        ArtificialScentDecorator scentedCake = new ArtificialScentDecorator(cherryCake);
        NameCardDecorator nameCardOnCake = new NameCardDecorator(scentedCake);
        System.out.println(nameCardOnCake);

        System.out.println();

        PastryBase pastry = new PastryBase();
        CreamDecorator creamPastry = new CreamDecorator(pastry);
        CherryDecorator cherryPastry = new CherryDecorator(creamPastry);
        System.out.println(cherryPastry);
    }
}
