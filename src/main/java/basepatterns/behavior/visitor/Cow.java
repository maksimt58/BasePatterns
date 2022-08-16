package basepatterns.behavior.visitor;

public class Cow implements Animal{
    @Override
    public void voiceForVisitor(Visitor visitor){
        visitor.lookAnimal(this);
        System.out.println("Мууууу");
    }
}
