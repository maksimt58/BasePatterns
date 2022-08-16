package basepatterns.creational.abstractFactory.beautySalon;

import basepatterns.creational.abstractFactory.Photographer;

public class PhotographerByModels implements Photographer {
    @Override
    public void makePhotoContent() {
        System.out.println("Photographer makes photo for models");
    }
}
