package basepatterns.creational.abstractFactory.cosmeticsShop;

import basepatterns.creational.abstractFactory.SmmManager;

public class SmmCosmeticSpecial implements SmmManager {
    @Override
    public void createSmmStrategy() {
        System.out.println("smm manager draws up a cosmetic brand development plan");
    }
}