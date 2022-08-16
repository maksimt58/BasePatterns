package basepatterns.behavior.command;

public class ChannelUpCommand  implements Command{
    RemoteController remoteController;

    public ChannelUpCommand(RemoteController remoteController) {
        this.remoteController = remoteController;
    }

    @Override
    public void execute() {
        remoteController.channelUp();
    }
}
