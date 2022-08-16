package basepatterns.creational.abstractFactory.beautySalon;

import basepatterns.creational.abstractFactory.*;

public class BeautyTeamFactory implements ProjectTeamFactory {
    @Override
    public CopyWriter getCopyWriter() {
        return new CopyWriterBeautySpecial();
    }

    @Override
    public MarketingDirector getMarketingDirector() {
        return new BeautyMarketingDirector();
    }

    @Override
    public Photographer getPhotographer() {
        return new PhotographerByModels();
    }

    @Override
    public SmmManager getSmmManager() {
        return new SmmBeautySpecial();
    }

    @Override
    public Targetolog getTargetolog() {
        return new TargetologBeautySpecial();
    }
}
