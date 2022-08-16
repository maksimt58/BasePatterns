package basepatterns.behavior.visitor;

public class ZooRunner {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Visitor mom = new Mom();
        Visitor son = new Son();

        System.out.println("Mom walks zoo");
        zoo.presentsAnimal(mom);
        System.out.println("======================================");
        System.out.println("Son walks zoo");
        zoo.presentsAnimal(son);
    }
}
