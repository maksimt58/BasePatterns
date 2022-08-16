package basepatterns.behavior.chain;

public class NormalTask extends TaskNotifier{

    public NormalTask(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Send simple notify using email " + message);
    }
}
