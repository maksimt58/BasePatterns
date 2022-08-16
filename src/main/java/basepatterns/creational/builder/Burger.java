package basepatterns.creational.builder;

public class Burger {
    private String name;
    private Cutlet cutlet;
    private Size size;
    private int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setCutlet(Cutlet cutlet) {
        this.cutlet = cutlet;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "name='" + name + '\'' +
                ", cutlet=" + cutlet +
                ", size=" + size +
                ", price=" + price +
                '}';
    }
}
