package basepatterns.structural.decorator;

public class MilkCoffee extends CoffeeDecorator {

    public MilkCoffee(Coffee coffee) {
        super(coffee);
    }

    public  String drinkMilkCoffee(){
        return " Milk coffee the best.";
    }

    @Override
    public String drink() {
        return super.drink() + drinkMilkCoffee();
    }
}
