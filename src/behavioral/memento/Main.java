package behavioral.memento;

class Main {
    public static void main(String[] args) {
        EditorOriginator editorOriginator = new EditorOriginator();
        EditorCaretaker editorCaretaker = new EditorCaretaker(editorOriginator);

        editorOriginator.type("Hi there ");
        editorCaretaker.checkpoint();

        editorOriginator.type("my name is Hugo ");
        editorOriginator.type("what's yours?");
        editorCaretaker.checkpoint();

        editorCaretaker.rollback();
        editorCaretaker.rollback();
        System.out.println(editorOriginator);
    }
}
