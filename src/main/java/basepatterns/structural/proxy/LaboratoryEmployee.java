package basepatterns.structural.proxy;

public class LaboratoryEmployee {
    public static void main(String[] args) {
        Door labDoor = new SecurityPasswordDoor("qwerty123");

        labDoor.open();
    }
}
