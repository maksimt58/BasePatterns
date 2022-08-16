package basepatterns.behavior.chain;

public class ImportantTask extends TaskNotifier{
    public ImportantTask(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Send important notify using sms " + message);
    }
}
