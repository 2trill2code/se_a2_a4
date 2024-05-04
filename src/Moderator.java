import java.util.Date;

public class Moderator extends Account {
    private String modID;
    private Date datePromoted;

    public void manageFlags() { };
    public void banUser(String accountID) { };
    public void unbanUser(String accountID) { };
    public void createCommunityPost() { };
    public void modifyPost(String postID) { };
    public void deletePost(String postID) { };
}
