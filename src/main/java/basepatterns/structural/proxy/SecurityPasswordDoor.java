package basepatterns.structural.proxy;

public class SecurityPasswordDoor implements Door{
    String password;
    LaboratoryDoor door;

    public SecurityPasswordDoor(String password) {

        this.password = password;

        if(door == null) {
            this.door = new LaboratoryDoor();
        }
    }

    @Override
    public void open() {
        open(password);
    }

    public void open(String password){
        if(authenticate(password)){
            System.out.println("Password correctly! ");
            door.open();
        }else{
            System.out.println("Opps! Invalid password");
        }
    }

    public boolean authenticate(String password){
        return password.equals("qwerty123");
    }


    @Override
    public void close() {
        door.close();
    }
}
