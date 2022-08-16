package basepatterns.creational.abstractFactory.cosmeticsShop;

import basepatterns.creational.abstractFactory.Targetolog;

public class TargetologCosmeticSpecial  implements Targetolog {
    @Override
    public void setsUpAdsForTargetAudience() {
        System.out.println("Targetolog sets up advertising for a selected target audience");
    }
}
