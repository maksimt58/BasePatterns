package basepatterns.behavior.state;

import java.util.Locale;

public class UpperCase implements WritingState{
    @Override
    public void write(String word) {
        System.out.println(word.toUpperCase());
    }
}
