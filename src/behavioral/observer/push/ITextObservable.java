package behavioral.observer.push;

interface ITextObservable {
    void addTextObserver(ITextObserver observer);

    void removeTextObserver(ITextObserver observer);

    void doNotify();
}
