package basepatterns.behavior.strategy;

public class TextEditorRunner {
    public static void main(String[] args) {
        WritingState state = new Default();
        TextEditor textEditor = new TextEditor(state);

        textEditor.setState(new UpperCase());

        textEditor.write("Write Java Code");

        textEditor.setState(new LowerCase());

        textEditor.write("Write Java Code");
    }
}
