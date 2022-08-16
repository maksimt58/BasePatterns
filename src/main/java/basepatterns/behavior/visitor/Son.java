package basepatterns.behavior.visitor;

public class Son implements Visitor{
    @Override
    public void lookAnimal(Monkey monkey) {
        System.out.println("Son Look monkey");
    }

    @Override
    public void lookAnimal(Lion lion) {
        System.out.println("Son Look lion");
    }

    @Override
    public void lookAnimal(Cow cow) {
        System.out.println("Son Look cow");
    }
}
