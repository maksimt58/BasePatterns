package basepatterns.behavior.command;

public class ChannelDownCommand  implements Command{
    RemoteController remoteController;

    public ChannelDownCommand(RemoteController remoteController) {
        this.remoteController = remoteController;
    }

    @Override
    public void execute() {
        remoteController.channelDown();
    }
}
