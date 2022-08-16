package basepatterns.behavior.observer;

import java.util.List;

public class Subscriber implements Observer{
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> promo) {
        System.out.println("Уважаемый " + name + " у нас для Вас новые уникальные предложения: \n" + promo);
    }
}
