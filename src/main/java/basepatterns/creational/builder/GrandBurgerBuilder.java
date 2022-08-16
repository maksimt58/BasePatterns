package basepatterns.creational.builder;

public class GrandBurgerBuilder extends BurgerBuilder {
    @Override
    void buildName() {
        burger.setName("Grand");
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
        burger.setPrice(299);
    }
}
