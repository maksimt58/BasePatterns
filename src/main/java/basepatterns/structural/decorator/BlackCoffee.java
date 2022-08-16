package basepatterns.structural.decorator;

public class BlackCoffee implements Coffee{
    @Override
    public String drink() {
        return "Black coffee is strong.";
    }
}
