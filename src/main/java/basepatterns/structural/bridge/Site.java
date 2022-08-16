package basepatterns.structural.bridge;

public abstract class Site {
    protected ColorTheme colorTheme;

    public Site(ColorTheme colorTheme) {
        this.colorTheme = colorTheme;
    }

    public abstract  void seeSheetSite();
}
