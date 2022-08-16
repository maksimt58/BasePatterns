package basepatterns.creational.builder;

public class McDonalds {
    BurgerBuilder burgerBuilder;

    public void setBurgerBuilder(BurgerBuilder burgerBuilder) {
        this.burgerBuilder = burgerBuilder;
    }

    Burger buildBurger(){
        burgerBuilder.createBurger();
        burgerBuilder.buildName();
        burgerBuilder.buildCutlet();
        burgerBuilder.buildSize();
        burgerBuilder.buildPrice();

        Burger burger = burgerBuilder.getBurger();

        return burger;
    }
}
