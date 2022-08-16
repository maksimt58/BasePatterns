package basepatterns.behavior.command;

public class Neighbour {
    Command power;
    Command channelUp;
    Command channelDown;
    Command changeVolume;

    public Neighbour(Command power, Command channelUp, Command channelDown, Command changeVolume) {
        this.power = power;
        this.channelUp = channelUp;
        this.channelDown = channelDown;
        this.changeVolume = changeVolume;
    }

    public void powerTV(){
        power.execute();
    }

    public void channelUpTV(){
        channelUp.execute();
    }
    public void channelDownTV(){
        channelDown.execute();
    }
    public void changeVolumeTV(){
        changeVolume.execute();
    }
}
