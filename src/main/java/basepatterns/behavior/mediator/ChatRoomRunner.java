package basepatterns.behavior.mediator;

public class ChatRoomRunner {
    public static void main(String[] args) {
        ChatRoomMediator chat = new ChatRoom();

        User simpleUser1 = new SimpleUser(chat,"Maks");
        User simpleUser2 = new SimpleUser(chat,"Natasha");

        simpleUser1.send("Hello");
        simpleUser2.send("Hi, Maks");
    }
}
