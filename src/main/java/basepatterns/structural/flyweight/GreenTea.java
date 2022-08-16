package basepatterns.structural.flyweight;

public class GreenTea implements Tea{
    @Override
    public void makeTea() {
        System.out.println("Drink the green tea");
    }
}
