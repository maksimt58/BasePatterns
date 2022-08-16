package basepatterns.structural.decorator;

public class CoffeeCafe {
    public static void main(String[] args) {
        Coffee coffee = new MilkVanillaCoffee(new MilkCoffee(new BlackCoffee()));
        System.out.println(coffee.drink());
    }
}
