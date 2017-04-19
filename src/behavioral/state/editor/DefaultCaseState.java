package behavioral.state.editor;

class DefaultCaseState implements IWritingState {
    @Override
    public void write(String words) {
        System.out.println(words);
    }
}
