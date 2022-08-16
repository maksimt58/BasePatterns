package basepatterns.creational.abstractFactory;

public interface ProjectTeamFactory {
    CopyWriter getCopyWriter();
    MarketingDirector getMarketingDirector();
    Photographer getPhotographer();
    SmmManager getSmmManager();
    Targetolog getTargetolog();

}
