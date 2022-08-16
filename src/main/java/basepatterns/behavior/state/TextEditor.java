package basepatterns.behavior.state;

public class TextEditor {
    WritingState state;

    public TextEditor(WritingState state) {
        this.state = state;
    }

    public void setState(WritingState state) {
        this.state = state;
    }

    public void changeState(){
        if(state instanceof Default){
            setState(new UpperCase());
        }else if(state instanceof UpperCase){
            setState(new LowerCase());
        }else if(state instanceof LowerCase){
            setState(new Default());
        }
    }

    public void write(String word){
        state.write(word);
    }
}
