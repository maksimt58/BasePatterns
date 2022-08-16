package basepatterns.structural.facade;

public class WorkPC {
    Computer computer = new Computer();
    PowerButton powerButton = new PowerButton();
    MotherBoard motherBoard = new MotherBoard();

    public void startPC(){
        computer.isWorking();
        powerButton.pressPowerButtonON();
        motherBoard.receivesCurrent(powerButton);
    }
}
