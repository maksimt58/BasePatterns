package basepatterns.creational.abstractFactory;

import basepatterns.creational.abstractFactory.cosmeticsShop.CosmeticShopTeamFactory;

public class CosmeticShopRoza {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new CosmeticShopTeamFactory();
        CopyWriter copyWriter = projectTeamFactory.getCopyWriter();
        MarketingDirector marketingDirector = projectTeamFactory.getMarketingDirector();
        Photographer photographer = projectTeamFactory.getPhotographer();
        SmmManager smmManager = projectTeamFactory.getSmmManager();
        Targetolog targetolog = projectTeamFactory.getTargetolog();

        System.out.println("Opening new cosmetic shop...");
        marketingDirector.manageMoneyAndTeam();
        smmManager.createSmmStrategy();
        photographer.makePhotoContent();
        copyWriter.makeTextContent();
        targetolog.setsUpAdsForTargetAudience();
    }
}
