package basepatterns.behavior.state;

public class Default implements WritingState{
    @Override
    public void write(String word) {
        System.out.println(word);
    }
}
