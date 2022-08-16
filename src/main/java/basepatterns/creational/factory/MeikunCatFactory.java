package basepatterns.creational.factory;

public class MeikunCatFactory implements CatFactory{
    @Override
    public Cat createCat() {
        return new Meikun();
    }
}
