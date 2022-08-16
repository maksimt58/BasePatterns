package basepatterns.structural.bridge;

public class LightColorTheme implements ColorTheme{
    @Override
    public void setColorTheme() {
        System.out.println("Set Light theme for site sheet");
    }
}
