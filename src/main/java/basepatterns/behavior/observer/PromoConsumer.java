package basepatterns.behavior.observer;

import jdk.swing.interop.SwingInterOpUtils;

public class PromoConsumer {
    public static void main(String[] args) {
        MarketPlace marketPlace = new MarketPlace();

        marketPlace.addPromo("2+1");
        marketPlace.addPromo("sale 50%");


        Observer subscriber1 = new Subscriber("Maks");
        Observer subscriber2 = new Subscriber("Vladislav");

        marketPlace.addObserver(subscriber1);
        marketPlace.addObserver(subscriber2);

        marketPlace.addPromo("sale 25%");
        System.out.println();
        marketPlace.addPromo("sale 75%");

        System.out.println();

        marketPlace.removePromo("2+1");
    }
}
