package basepatterns.behavior.state;

public class TextEditorRunner {
    public static void main(String[] args) {
        WritingState state = new Default();
        TextEditor textEditor = new TextEditor(state);

        for (int i = 0; i < 6; i++) {
            textEditor.write("Writing Java Code!");
            textEditor.changeState();
        }
    }
}
