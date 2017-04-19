package structural.adapter;

class Main {
    public static void main(String[] args) {
        Hunter hunter = new Hunter();

        AfricanLion africanLion = new AfricanLion();
        AsianLion asianLion = new AsianLion();

        WildDog wildDog = new WildDog();

        hunter.hunt(africanLion);
        hunter.hunt(asianLion);
        hunter.hunt(new WildDogAdapter(wildDog));
    }
}
