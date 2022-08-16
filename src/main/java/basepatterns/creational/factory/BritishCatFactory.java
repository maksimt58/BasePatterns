package basepatterns.creational.factory;

public class BritishCatFactory  implements CatFactory{
    @Override
    public Cat createCat() {
        return new British();
    }
}