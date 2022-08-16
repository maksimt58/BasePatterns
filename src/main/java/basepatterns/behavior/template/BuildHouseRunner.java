package basepatterns.behavior.template;

public class BuildHouseRunner {
    public static void main(String[] args) {
        HouseTemplate simpleHouse = new SimpleHouse();
        HouseTemplate bigHouse = new BigHouse();


        simpleHouse.buildHouse();
        System.out.println("==============================");
        bigHouse.buildHouse();

    }
}
