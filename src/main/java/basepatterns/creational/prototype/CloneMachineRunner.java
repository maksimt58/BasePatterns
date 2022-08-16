package basepatterns.creational.prototype;

public class CloneMachineRunner {
    public static void main(String[] args) {
        Sheep sheep = new Sheep(1, "Dolly");

        System.out.println(sheep);

        SheepFactory sheepFactory = new SheepFactory(sheep);
        Sheep copySheep = sheepFactory.copySheep();

        System.out.println(copySheep);
    }
}
