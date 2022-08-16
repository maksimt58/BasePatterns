package basepatterns.structural.decorator;

public class CoffeeDecorator implements Coffee{
    Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }


    @Override
    public String drink() {
        return coffee.drink();
    }
}
