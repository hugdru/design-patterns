package behavioral.observer.pull;

interface ITextObservable {
    void addTextObserver(ITextObserver observer);

    void removeTextObserver(ITextObserver observer);

    String getText();

    void doNotify();
}
