package creational.prototype;

class Main {
    public static void main(String[] args) throws InterruptedException {
        ComputerPrototypeFactory computerPrototypeFactory = new ComputerPrototypeFactory();

        String desktopX300 = computerPrototypeFactory.register(
                new DesktopComputerPrototype(
                        "X300",
                        new String[]{"cpu king desktop", "mobo king desktop"})
        ).prototypeName;

        String laptopABZ120 = computerPrototypeFactory.register(
                new LaptopComputerPrototype(
                        "ABZ120",
                        new String[]{"cpu king laptop", "mobo king laptop"})
        ).prototypeName;

        System.out.println("Copying prototype " + desktopX300);
        System.out.println(computerPrototypeFactory.copy(desktopX300));

        System.out.println("Copying prototype " + laptopABZ120);
        System.out.println(computerPrototypeFactory.copy(laptopABZ120));
    }
}
