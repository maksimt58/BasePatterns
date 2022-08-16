package basepatterns.creational.abstractFactory.beautySalon;

import basepatterns.creational.abstractFactory.Targetolog;

public class TargetologBeautySpecial implements Targetolog {
    @Override
    public void setsUpAdsForTargetAudience() {
        System.out.println("Targetolog sets up advertising for a selected target audience");
    }
}
