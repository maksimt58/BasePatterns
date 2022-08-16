package basepatterns.structural.flyweight;

public class BlackTea implements Tea{
    @Override
    public void makeTea() {
        System.out.println("Drink the black tea");
    }
}
