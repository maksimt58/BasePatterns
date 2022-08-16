package basepatterns.behavior.command;

public class ChangeVolumeCommand implements Command{
    RemoteController remoteController;

    public ChangeVolumeCommand(RemoteController remoteController) {
        this.remoteController = remoteController;
    }

    @Override
    public void execute() {
        remoteController.changeVolume();
    }
}
