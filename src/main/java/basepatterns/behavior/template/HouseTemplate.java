package basepatterns.behavior.template;

public abstract class HouseTemplate {
    public void buildHouse(){
        System.out.println("заливаем фундамент");
        buildFoundation();
        System.out.println("возводим стены");
        buildWalls();
        System.out.println("настилаем крышу");
        buildRoof();
    }

    public abstract void buildFoundation();
    public abstract void buildWalls();
    public abstract void buildRoof();
}
