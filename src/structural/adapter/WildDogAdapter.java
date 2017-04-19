package structural.adapter;

class WildDogAdapter implements ILion {
    private WildDog wildDog;

    WildDogAdapter(WildDog wildDog) {
        this.wildDog = wildDog;
    }

    @Override
    public void roar() {
        this.wildDog.bark();
    }
}
