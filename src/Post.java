import java.util.List;
import java.util.Date;

public abstract class Post {
    private String postID;
    private Date postDate;
    private int numVotes;
    private int numViews;
    private String accountID;
    private String content;
    private List<Flag> flags;
    private List<Comment> comments;

    /**
     * @param accountID The ID of the account to notify
     * @return No return value
     */
    public void notifyPoster(String accountID) { return; }; 

    /**
     * @param vote The vote to change to
     * @return No return value
     */
    public void changeVote(int vote) { return; };
}
