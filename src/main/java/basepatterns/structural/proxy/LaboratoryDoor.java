package basepatterns.structural.proxy;

public class LaboratoryDoor implements Door{
    @Override
    public void open() {
        System.out.println("Opening the Laboratory Door");
    }

    @Override
    public void close() {
        System.out.println("Closing the Laboratory Door");
    }
}
