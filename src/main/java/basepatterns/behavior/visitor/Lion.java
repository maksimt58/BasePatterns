package basepatterns.behavior.visitor;

public class Lion implements Animal{
    @Override
    public void voiceForVisitor(Visitor visitor){
        visitor.lookAnimal(this);
        System.out.println("Гррррргргррр");
    }
}
