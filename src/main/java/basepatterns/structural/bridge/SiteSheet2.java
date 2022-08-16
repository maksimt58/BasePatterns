package basepatterns.structural.bridge;

public class SiteSheet2 extends Site{

    public SiteSheet2(ColorTheme colorTheme) {
        super(colorTheme);
    }

    @Override
    public void seeSheetSite() {
        System.out.println("Now you see the sheet site \"About company\"");
    }
}
