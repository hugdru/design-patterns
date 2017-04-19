package behavioral.memento;

class EditorOriginator {
    private String content = "";

    public void type(String words) {
        this.content += words;
        System.out.println(this.content);
    }

    public String getContent() {
        return this.content;
    }

    public EditorMemento createMemento() {
        return new EditorMemento(content);
    }

    public void setMemento(EditorMemento memento) {
        this.content = memento.getState();
    }

    @Override
    public String toString() {
        return this.content;
    }
}
