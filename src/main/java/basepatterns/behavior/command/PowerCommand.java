package basepatterns.behavior.command;

public class PowerCommand implements Command{
    RemoteController remoteController;

    public PowerCommand(RemoteController remoteController) {
        this.remoteController = remoteController;
    }

    @Override
    public void execute() {
        remoteController.power();
    }
}
