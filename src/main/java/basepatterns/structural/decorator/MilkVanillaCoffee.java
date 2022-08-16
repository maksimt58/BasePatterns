package basepatterns.structural.decorator;

public class MilkVanillaCoffee extends CoffeeDecorator{
    public MilkVanillaCoffee(Coffee coffee) {
        super(coffee);
    }

    public String addVanilla(){
        return " Add vanilla in milk coffee.";
    }

    @Override
    public String drink() {
        return super.drink() + addVanilla();
    }
}
