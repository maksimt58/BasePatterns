package basepatterns.behavior.mediator;

import java.util.Date;

public class ChatRoom implements ChatRoomMediator{
    @Override
    public void showMessage(SimpleUser simpleUser, String message) {
        Date time = new Date();

        System.out.println(time + "[" + simpleUser.getName() + "]" + message);
    }
}
