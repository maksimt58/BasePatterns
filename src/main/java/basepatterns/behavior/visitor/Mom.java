package basepatterns.behavior.visitor;

public class Mom implements Visitor{
    @Override
    public void lookAnimal(Monkey monkey) {
        System.out.println("Mom Look monkey");
    }

    @Override
    public void lookAnimal(Lion lion) {
        System.out.println("Mom Look lion");
    }

    @Override
    public void lookAnimal(Cow cow) {
        System.out.println("Mom Look cow");
    }
}
