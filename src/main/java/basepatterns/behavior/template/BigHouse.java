package basepatterns.behavior.template;

public class BigHouse extends HouseTemplate {
    @Override
    public void buildFoundation() {
        System.out.println("Заливаем фундамент из бетона");
    }

    @Override
    public void buildWalls() {
        System.out.println("Возводим кирпичные стены");
    }

    @Override
    public void buildRoof() {
        System.out.println("Делаем крышу из черепицы");
    }
}
