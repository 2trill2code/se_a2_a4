import java.util.List;
import java.util.Date;

public abstract class Post {
    private Account account;
    private List<Flag> flags;
    private List<Comment> comments;
    
    private String postID;
    private String accountID; // think this should be a reference to the accountID
    private Date postDate;
    private int numVotes;
    private int numViews;
    private String title;
    private String content;

    /**
     * @param postID The ID of the post to be edited
     * @return No return value
     */
    public void editPost(String postID) { return; }; // does this need a param if its just editing itself?

    /**
     * @param accountID The ID of the account to notify
     * @return No return value
     */
    public void notifyPoster(String accountID) { return; }; // same with this

    /**
     * @param postID The ID of the post to flag
     * @return No return value
     */
    public void addFlag(String postID) { return; };

    /**
     * @param postID The ID of the post to upvote
     * @return No return value
     */
    public void upvotePost(String postID) { return; };

    /**
     * @param postID The ID of the post to downvote
     * @return No return value
     */
    public void downvotePost(String postID) { return; };
}
