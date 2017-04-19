package behavioral.observer.pull;

class Main {
    public static void main(String[] args) {
        ConcreteObserver concreteObserver1 = new ConcreteObserver("First Concrete Observer");
        ConcreteObserver concreteObserver2 = new ConcreteObserver("Second Concrete Observer");
        ConcreteObserver concreteObserver3 = new ConcreteObserver("Third Concrete Observer");

        ConcreteTextObservable concreteTextObservable = new ConcreteTextObservable("first text");
        concreteTextObservable.addTextObserver(concreteObserver1);
        concreteTextObservable.addTextObserver(concreteObserver2);
        concreteTextObservable.addTextObserver(concreteObserver3);

        System.out.println();

        concreteTextObservable.removeTextObserver(concreteObserver3);
        concreteTextObservable.setText("second text");

        System.out.println();

        concreteTextObservable.setText("Third text");
    }
}
