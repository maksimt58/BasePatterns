package basepatterns.behavior.chain;

public abstract class TaskNotifier {
    private int priorityTask;
    private TaskNotifier nextNotifier;

    public TaskNotifier(int priority) {
        priorityTask = priority;
    }

    public void setNextNotifier(TaskNotifier nextNotifier) {
        this.nextNotifier = nextNotifier;
    }

    public void notifyManager(String message, int level){
        if(level >= priorityTask){
            write(message);
        }
        if(nextNotifier != null){
         nextNotifier.notifyManager(message, level);
        }
    }

    public abstract void write(String message);
}
