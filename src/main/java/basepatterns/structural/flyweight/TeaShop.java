package basepatterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class TeaShop {
    public static void main(String[] args) {
        TeaFactory teaFactory = new TeaFactory();

        List<Tea> teas = new ArrayList<>();

        teas.add(teaFactory.getTeaByColor("black"));
        teas.add(teaFactory.getTeaByColor("black"));
        teas.add(teaFactory.getTeaByColor("black"));
        teas.add(teaFactory.getTeaByColor("black"));
        teas.add(teaFactory.getTeaByColor("green"));
        teas.add(teaFactory.getTeaByColor("green"));
        teas.add(teaFactory.getTeaByColor("green"));
        teas.add(teaFactory.getTeaByColor("green"));

        for (Tea tea : teas) {
            tea.makeTea();
        }

    }
}
