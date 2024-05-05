import java.util.List;
import java.util.Date;

public class Notification {
    private List<Inbox> destinationAccountIDs;
    
    private String notificationID;
    private String notificationContent;
    private Date dateSent;

    // might to add some params to the functions ?

    /**
     * @param accountID The ID of the account to send to
     * @return No return value
     */
    public void sendToInbox(String accountID) { return; };

    /**
     * @param void
     * @return No return value
     */
    public void sendToAllUsers() { return; };
}
