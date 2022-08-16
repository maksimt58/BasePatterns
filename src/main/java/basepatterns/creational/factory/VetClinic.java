package basepatterns.creational.factory;

import java.util.Locale;

public class VetClinic {
    public static void main(String[] args) {
        //CatFactory catFactory = createCatByBreedName("Meikun");
        //CatFactory catFactory = createCatByBreedName("Siam");
        CatFactory catFactory = createCatByBreedName("British");

        Cat cat = catFactory.createCat();

        cat.sayMeow();
    }

    static CatFactory createCatByBreedName(String breedName) {
        String breed = breedName.toLowerCase(Locale.ROOT);

        switch (breed) {
            case "meikun":
                return new MeikunCatFactory();

            case "siam":
                return new SiamCatFactory();

            case "british":
                return new BritishCatFactory();

            default:
                throw new RuntimeException(breedName + " is unknown breed");
        }
    }
}
