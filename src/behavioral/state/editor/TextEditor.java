package behavioral.state.editor;

class TextEditor {
    private IWritingState IWritingState = new DefaultCaseState();

    public void setWritingState(IWritingState IWritingState) {
        this.IWritingState = IWritingState;
    }

    public void type(String words) {
        this.IWritingState.write(words);
    }
}
