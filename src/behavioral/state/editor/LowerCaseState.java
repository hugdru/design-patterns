package behavioral.state.editor;

class LowerCaseState implements IWritingState {
    @Override
    public void write(String words) {
        System.out.println(words.toLowerCase());
    }
}
