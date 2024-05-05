import java.util.List;

public class Account {
    private Inbox inbox;
    private Membership membershipDetails;
    private List<Post> posts;
    
    private String accountID;
    private String username; 
    private String email;
    private String password;

    /**
     * @param postID The ID of the post to be viewed
     * @return No return value
     */
    public void viewPost(String postID) { return; };

    /**
     * @param void
     * @return The ID of the post
     */
    public String createPost() { return ""; };

    /**
     * @param void
     * @return The ID of the question
     */
    public String createQuestion() { return ""; };

    /**
     * @param postID The ID of the post (question) being answered
     * @return The ID of the answer
     */
    public String createAnswer(String postID) { return ""; };

    /**
     * @param postID The ID of the post (question/answer/post) being commented on
     * @return The ID of the comment
     */
    public String createComment(String postID) { return ""; };
    
    /**
     * @param postID The ID of the post being voted on
     * @param vote 1 or -1 representing an upvote or downvote respectively
     * @return No return value
     */
    public void votePost(String postID, int vote) { return; };

    /**
     * @param commentID The ID of the comment being voted on
     * @param vote 1 or -1 representing an upvote or downvote respectively
     * @return No return value
     */
    public void voteComment(String commentID, int vote) { return; };

    /**
     * @param postID The ID of the post to be edited
     * @return No return value
     */
    public void editPost(String postID) { return; };

    /**
     * @param commentID The ID of the comment to be edited
     * @return No return value
     */
    public void editComment(String commentID) { return; };

    /**
     * @param postID The ID of the post to be flagged
     * @param commentID The ID of the commenet to be flagged
     * @param flag The type of flag to be applied to the content
     * @return No return value
     */
    public void addFlag(String postID, String commentID, Flag flag) { return; }
}
