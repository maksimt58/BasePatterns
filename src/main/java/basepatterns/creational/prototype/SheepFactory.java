package basepatterns.creational.prototype;

public class SheepFactory {
    Sheep sheep;

    public SheepFactory(Sheep sheep) {
        this.sheep = sheep;
    }

    public void setSheep(Sheep sheep) {
        this.sheep = sheep;
    }

    Sheep copySheep(){
        return (Sheep) sheep.copy();
    }
}
