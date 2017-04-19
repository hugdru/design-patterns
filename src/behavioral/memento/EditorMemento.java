package behavioral.memento;

class EditorMemento {
    private String state;

    public EditorMemento(String state) {
        this.state = state;
    }

    public String getState() {
        return this.state;
    }
}
