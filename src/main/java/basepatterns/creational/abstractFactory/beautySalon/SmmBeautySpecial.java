package basepatterns.creational.abstractFactory.beautySalon;

import basepatterns.creational.abstractFactory.SmmManager;

public class SmmBeautySpecial implements SmmManager {
    @Override
    public void createSmmStrategy() {
        System.out.println("smm manager draws up a beauty brand development plan");
    }
}
