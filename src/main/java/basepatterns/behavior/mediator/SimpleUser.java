package basepatterns.behavior.mediator;

public class SimpleUser implements User{
    ChatRoomMediator chat;
    String name;

    public SimpleUser(ChatRoomMediator chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void send(String message){
        chat.showMessage(this, message);
    }
}
