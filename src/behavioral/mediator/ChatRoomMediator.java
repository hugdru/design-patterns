package behavioral.mediator;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

class ChatRoomMediator {
    public void showMessage(User user, String message) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(dateFormat.format(new Date()) + " [" + user.getName() + "] " + message);
    }
}
