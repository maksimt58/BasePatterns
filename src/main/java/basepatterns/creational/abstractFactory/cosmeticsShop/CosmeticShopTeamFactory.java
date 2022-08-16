package basepatterns.creational.abstractFactory.cosmeticsShop;

import basepatterns.creational.abstractFactory.*;

public class CosmeticShopTeamFactory  implements ProjectTeamFactory {
    @Override
    public CopyWriter getCopyWriter() {
        return new CopyWriterCosmeticSpecial();
    }

    @Override
    public MarketingDirector getMarketingDirector() {
        return new CosmeticMarketingDirector();
    }

    @Override
    public Photographer getPhotographer() {
        return new PhotographerByThings();
    }

    @Override
    public SmmManager getSmmManager() {
        return new SmmCosmeticSpecial();
    }

    @Override
    public Targetolog getTargetolog() {
        return new TargetologCosmeticSpecial();
    }
}
