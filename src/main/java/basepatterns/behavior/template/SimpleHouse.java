package basepatterns.behavior.template;

public class SimpleHouse extends HouseTemplate {
    @Override
    public void buildFoundation() {
        System.out.println("Заливаем фундамент из цемента");
    }

    @Override
    public void buildWalls() {
        System.out.println("Возводим  стены из сип панелей");
    }

    @Override
    public void buildRoof() {
        System.out.println("Делаем крышу из шифера");
    }
}
