import java.util.ArrayList;
import java.util.Date;

public class Message {
    private ArrayList<String> destinationAccountID;
    private String messageID;
    private String messageContent;
    private Date dateSent;

    // might to add some params to the functions ?
    public void sendToInbox(String accountID) { };
    public void sendToAllUsers() { };
}
