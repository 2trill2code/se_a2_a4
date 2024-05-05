import java.util.List;

public class Inbox {
    private List<Notification> notifications;     
    private String accountID;
    private int numNotifications;

    /**
     * @param notificationID The ID of the notification to be viewed
     * @return No return value
     */
    public void viewNotification(String notificationID) { return; };

    /**
     * @param notificationID The ID of the notification to be marked as read
     * @return boolean True if the notification was successfully marked as read, false otherwise
     */
    public boolean markNotificaitonAsRead(String notificationID) { return true; };
}
