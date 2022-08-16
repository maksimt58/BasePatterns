package basepatterns.behavior.visitor;

public interface Visitor {
    void lookAnimal(Monkey monkey);
    void lookAnimal(Lion lion);
    void lookAnimal(Cow cow);
}
