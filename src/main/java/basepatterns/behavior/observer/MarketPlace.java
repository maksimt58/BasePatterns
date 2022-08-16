package basepatterns.behavior.observer;

import java.util.ArrayList;
import java.util.List;

public class MarketPlace implements Observed{
    List<String> promotions = new ArrayList<>();
    List<Observer> subscribers = new ArrayList<>();

    public void addPromo(String promo){
        promotions.add(promo);
        notifyObservers();
    }

    public void removePromo(String promo){
        promotions.remove(promo);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : subscribers) {
            observer.handleEvent(promotions);
        }

    }
}
