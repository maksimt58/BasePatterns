package basepatterns.behavior.command;

public class TVForWeekendRunner {
    public static void main(String[] args) {
        RemoteController remoteController = new RemoteController();
        Neighbour vasya = new Neighbour(
                new PowerCommand(remoteController),
                new ChannelUpCommand(remoteController),
                new ChannelDownCommand(remoteController),
                new ChangeVolumeCommand(remoteController)
        );

        vasya.powerTV();
        vasya.channelUpTV();
        vasya.channelDownTV();
        vasya.changeVolumeTV();
    }
}
