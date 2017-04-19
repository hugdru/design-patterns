package behavioral.observer.pull;

import java.util.HashSet;

class ConcreteTextObservable implements ITextObservable {

    private String text;
    private HashSet<ITextObserver> textObservers = new HashSet<>();

    public ConcreteTextObservable(String text) {
        this.text = text;
    }

    @Override
    public void addTextObserver(ITextObserver observer) {
        textObservers.add(observer);
        observer.doUpdate(this);
    }

    @Override
    public void removeTextObserver(ITextObserver observer) {
        textObservers.remove(observer);
    }

    @Override
    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
        this.doNotify();
    }

    @Override
    public void doNotify() {
        for (ITextObserver textObserver : textObservers) {
            textObserver.doUpdate(this);
        }
    }
}
