package basepatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TeaFactory {
    private static final Map<String,Tea> differentTeas = new HashMap<>();

    public Tea getTeaByColor(String teaColor){
        Tea tea = differentTeas.get(teaColor);

        if(tea == null){
            switch (teaColor){
                case "black":
                    System.out.println("Brew black tea");
                    tea = new BlackTea();
                    break;
                case "green":
                    System.out.println("Brew green  tea");
                    tea = new GreenTea();
                    break;
            }
            differentTeas.put(teaColor,tea);
        }
        return tea;
    }
}
