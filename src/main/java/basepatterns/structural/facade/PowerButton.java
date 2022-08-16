package basepatterns.structural.facade;

public class PowerButton {
    private boolean pressPowerButton;

    public boolean isPressPowerButton(){
        return pressPowerButton;
    }

    public void pressPowerButtonON(){
        System.out.println("Power Button is ON");
        pressPowerButton = true;
    }

    public void pressPowerButtonOFF(){
        System.out.println("Power Button is OFF");
        pressPowerButton = false;
    }
}
