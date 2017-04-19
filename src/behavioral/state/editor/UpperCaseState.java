package behavioral.state.editor;

class UpperCaseState implements IWritingState {
    @Override
    public void write(String words) {
        System.out.println(words.toUpperCase());
    }
}
