package basepatterns.behavior.chain;

public class ASAPTask extends TaskNotifier{
    public ASAPTask(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Send ASAP notify using call duty engineer " + message);
    }
}
