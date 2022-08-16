package basepatterns.creational.singleton;

public class SunSystem {
    public static void main(String[] args) {
        StarSun starSun = StarSun.getStarSun();

        starSun.warmingPeople();
    }
}
