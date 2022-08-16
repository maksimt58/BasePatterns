package basepatterns.creational.builder;

public class BigMakBurgerBuilder extends BurgerBuilder {
    @Override
    void buildName() {
        burger.setName("Big Mak");
    }

    @Override
    void buildCutlet() {
        burger.setCutlet(Cutlet.BEEF);
    }

    @Override
    void buildSize() {
        burger.setSize(Size.M);
    }

    @Override
    void buildPrice() {
        burger.setPrice(500);
    }
}
