package basepatterns.structural.composite;

public class ITDirector implements Employee{
    @Override
    public void doWork() {
        System.out.println("I am director");
    }
}
