package basepatterns.creational.builder;

public abstract class BurgerBuilder {
    Burger burger;

    void createBurger(){
        burger = new Burger();
    }

    abstract void buildName();
    abstract void buildCutlet();
    abstract void buildSize();
    abstract void buildPrice();

    Burger getBurger(){
        return burger;
    }
}
