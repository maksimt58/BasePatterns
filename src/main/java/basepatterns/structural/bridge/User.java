package basepatterns.structural.bridge;

public class User {
    public static void main(String[] args) {
        Site[] sheetsSite = {
          new SiteSheet1(new LightColorTheme()),
          new SiteSheet2(new DarkColorTheme()),
          new SiteSheet3(new LightColorTheme())
        };

        for (Site sheets :sheetsSite) {
            sheets.seeSheetSite();
        }

    }
}
