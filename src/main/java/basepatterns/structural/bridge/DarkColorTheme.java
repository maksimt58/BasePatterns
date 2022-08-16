package basepatterns.structural.bridge;

public class DarkColorTheme  implements ColorTheme{
    @Override
    public void setColorTheme() {
        System.out.println("Set Dark theme for site sheet");
    }
}
