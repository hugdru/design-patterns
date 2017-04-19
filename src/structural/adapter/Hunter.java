package structural.adapter;

class Hunter {
    void hunt(ILion iLion) {
        System.out.println("This Hunter caught something ");
        iLion.roar();
        System.out.println();
    }
}
