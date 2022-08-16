package basepatterns.creational.builder;

public class BurgerConsumer {
    public static void main(String[] args) {
        McDonalds mcDonalds = new McDonalds();
        //mcDonalds.setBurgerBuilder(new GrandBurgerBuilder());
        mcDonalds.setBurgerBuilder(new BigMakBurgerBuilder());

        Burger burger = mcDonalds.buildBurger();

        System.out.println(burger);
    }
}
