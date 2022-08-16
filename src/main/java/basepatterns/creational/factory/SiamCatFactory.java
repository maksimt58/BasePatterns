package basepatterns.creational.factory;

public class SiamCatFactory  implements CatFactory{
    @Override
    public Cat createCat() {
        return new Siam();
    }
}