package basepatterns.behavior.visitor;

public class Zoo {
    Animal[] animals;

    public Zoo() {
        this.animals = new Animal[]{
                new Monkey(),
                new Lion(),
                new Cow()
        };
    }

    public  void presentsAnimal(Visitor visitor){
        for (Animal animal : animals) {
            animal.voiceForVisitor(visitor);
        }

    }
}
