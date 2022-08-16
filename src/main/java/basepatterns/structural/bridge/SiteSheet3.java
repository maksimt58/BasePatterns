package basepatterns.structural.bridge;

public class SiteSheet3 extends Site{

    public SiteSheet3(ColorTheme colorTheme) {
        super(colorTheme);
    }

    @Override
    public void seeSheetSite() {
        System.out.println("Now you see the sheet site \"Our Products\"");
    }
}
