    import java.util.ArrayList;

    public class Inbox {
        private String accountID;
        private ArrayList<String> messages; // fix type
        private int numMessages;

        public void viewMessage(String messageID) { };
        public void markMessageAsRead(String messageID) { };
        public void deleteMessage(String messageID) { };
        public String getAccountID() {
            return "accountID";
        };
        public ArrayList<String> getMessages() {
            return new ArrayList<String>();
        };
        public int getNumMessages() {
            return 1;
        };
    }
