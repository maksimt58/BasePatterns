package basepatterns.structural.facade;

public class MotherBoard {
    public void receivesCurrent(PowerButton powerButton){
        if(powerButton.isPressPowerButton()){
            System.out.println("the motherboard is energized");
        }else{
            System.out.println("the motherboard is NOT energized");
        }
    }
}
