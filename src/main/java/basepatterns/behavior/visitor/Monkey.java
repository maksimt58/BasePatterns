package basepatterns.behavior.visitor;

public class Monkey implements Animal{
    @Override
    public void voiceForVisitor(Visitor visitor) {
        visitor.lookAnimal(this);
        System.out.println("yyy УуууУУУ");
    }
}
