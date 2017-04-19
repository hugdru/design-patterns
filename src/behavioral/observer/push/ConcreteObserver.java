package behavioral.observer.push;

class ConcreteObserver implements ITextObserver {

    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void doUpdate(String text) {
        System.out.println(name + " was notified with: " + text);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
