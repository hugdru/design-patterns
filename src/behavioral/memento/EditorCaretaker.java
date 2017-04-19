package behavioral.memento;

import java.util.Stack;

class EditorCaretaker {
    private Stack<EditorMemento> mementos = new Stack<>();
    private EditorOriginator originator;

    EditorCaretaker(EditorOriginator originator) {
        this.originator = originator;
    }

    public void checkpoint() {
        System.out.println("Checkpoint created");
        mementos.push(originator.createMemento());
    }

    public void rollback() {
        System.out.println("Checkpoint rollback");
        originator.setMemento(mementos.pop());
    }
}
