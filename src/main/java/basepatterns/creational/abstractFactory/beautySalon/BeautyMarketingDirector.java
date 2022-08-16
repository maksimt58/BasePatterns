package basepatterns.creational.abstractFactory.beautySalon;

import basepatterns.creational.abstractFactory.MarketingDirector;

public class BeautyMarketingDirector implements MarketingDirector {
    @Override
    public void manageMoneyAndTeam() {
        System.out.println("Marketing director manages beauty projects");
    }
}
