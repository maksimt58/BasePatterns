package basepatterns.structural.bridge;

public class SiteSheet1 extends Site{

    public SiteSheet1(ColorTheme colorTheme) {
        super(colorTheme);
    }

    @Override
    public void seeSheetSite() {
        System.out.println("Now you see the sheet site \"Main\"");
    }
}
