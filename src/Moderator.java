import java.util.Date;

public class Moderator extends Account {
    private String modID;
    private Date datePromoted;

    /**
     * @param void
     * @return ID of the created community post
     */
    public String createCommunityPost() { return ""; };

    /**
     * @param postID The ID of the post to be modified
     * @return No return value
     */
    public void modifyPost(String postID) { return; };

    /**
     * @param postID The ID of the post to be deleted
     * @return No return value
     */
    public void deletePost(String postID) { return; };

    /**
     * @param accountID The ID of the user to be banned
     * @return No return value
     */
    public void banUser(String accountID) { return; };

    /**
     * @param accountID The ID of the user to be unbanned
     * @return No return value
     */
    public void unbanUser(String accountID) { return; };

    /**
     * @param postID The ID of the post whose flags need to be managed
     * @return No return value
     */
    public void manageFlags(String postID) { return; };
}
