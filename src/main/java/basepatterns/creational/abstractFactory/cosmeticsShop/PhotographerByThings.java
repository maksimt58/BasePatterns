package basepatterns.creational.abstractFactory.cosmeticsShop;

import basepatterns.creational.abstractFactory.Photographer;

public class PhotographerByThings implements Photographer {
    @Override
    public void makePhotoContent() {
        System.out.println("Photographer makes photo things");
    }
}