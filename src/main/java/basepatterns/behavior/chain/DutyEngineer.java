package basepatterns.behavior.chain;

public class DutyEngineer {
    public static void main(String[] args) {
        TaskNotifier normTask = new NormalTask(Priority.NORMAL);
        TaskNotifier importTask = new ImportantTask(Priority.IMPORTANT);
        TaskNotifier asapTask = new ASAPTask(Priority.ASAP);

        normTask.setNextNotifier(importTask);
        importTask.setNextNotifier(asapTask);

        normTask.notifyManager("Received normal task", Priority.NORMAL);
        normTask.notifyManager("Received important task", Priority.IMPORTANT);
        normTask.notifyManager("Received ASAP task", Priority.ASAP);

    }
}
