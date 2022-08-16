package basepatterns.structural.facade;

public class ComputerUserRunner {
    public static void main(String[] args) {
/*        Computer computer = new Computer();
        computer.isWorking();

        PowerButton powerButton = new PowerButton();
        powerButton.pressPowerButtonON();

        MotherBoard motherBoard = new MotherBoard();

        motherBoard.receivesCurrent(powerButton);

        powerButton.pressPowerButtonOFF();

        motherBoard.receivesCurrent(powerButton);*/

        WorkPC workPC = new WorkPC();

        workPC.startPC();
    }
}
