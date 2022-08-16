package basepatterns.behavior.strategy;

public class UpperCase implements WritingState {
    @Override
    public void write(String word) {
        System.out.println(word.toUpperCase());
    }
}
