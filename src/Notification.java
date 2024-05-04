import java.util.ArrayList;
import java.util.Date;

public class Notification {
    private ArrayList<String> destinationAccountID;
    private String notificationID;
    private String notificationContent;
    private Date dateSent;

    // might to add some params to the functions ?
    public void sendToInbox(String accountID) { };
    public void sendToAllUsers() { };
}
