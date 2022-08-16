package basepatterns.behavior.strategy;

public class Default implements WritingState {
    @Override
    public void write(String word) {
        System.out.println(word);
    }
}
