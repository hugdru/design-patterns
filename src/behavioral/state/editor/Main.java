package behavioral.state.editor;

class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();

        LowerCaseState lowerCaseState = new LowerCaseState();
        UpperCaseState upperCaseState = new UpperCaseState();

        textEditor.type("Hi");

        textEditor.setWritingState(lowerCaseState);
        textEditor.type("ARE YOU");

        textEditor.setWritingState(upperCaseState);
        textEditor.type("there");
    }
}
