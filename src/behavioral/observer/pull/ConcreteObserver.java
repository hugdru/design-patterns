package behavioral.observer.pull;

class ConcreteObserver implements ITextObserver {

    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void doUpdate(ITextObservable textObservable) {
        System.out.println(name + " was notified with: " + textObservable.getText());
    }

    @Override
    public String toString() {
        return this.name;
    }
}
