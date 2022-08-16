package basepatterns.creational.singleton;

public class StarSun {
    private static StarSun starSun;

    private StarSun() {

    }

    public static synchronized StarSun getStarSun() {
        if (starSun == null) {
            starSun = new StarSun();
        }

        return starSun;
    }

    public void warmingPeople() {
        System.out.println("I give warmth");
    }
}
