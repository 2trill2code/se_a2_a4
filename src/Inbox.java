    import java.util.List;

    public class Inbox {
        private List<Notification> notifications; // fix type
        private Account account;
        
        private String accountID;
        private int numNotifications;

        /**
         * @param notificationID The ID of the notification to be viewed
         * @return No return value
         */
        public void viewNotification(String notificationID) { return; };

        /**
         * @param notificationID The ID of the notification to be marked as read
         * @return No return value
         */
        public void markNotificaitonAsRead(String notificationID) { return; };

        /**
         * @param notificationID The ID of the notification to be deleted
         * @return No return value
         */
        public void deleteNotification(String notificationID) { return; };
    }
