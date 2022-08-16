package basepatterns.creational.abstractFactory.cosmeticsShop;

import basepatterns.creational.abstractFactory.MarketingDirector;

public class CosmeticMarketingDirector implements MarketingDirector {
    @Override
    public void manageMoneyAndTeam() {
        System.out.println("Marketing director manages cosmetic projects");
    }
}
