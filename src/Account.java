import java.util.List;

public class Account {
    enum accountType { NONE, SILVER, GOLD }; // idk to keep we have membershipType already

    private Inbox inbox;
    private Membership membership;
    private List<Post> posts;

    private String accountID;
    private String username; // added
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
    public String createAnswer(String postID) { return "";};

    /**
     * @param postID The ID of the post (question/answer/post) being commented on
     * @return The ID of the comment
     */
    public String createComment(String postID) { return ""; };

    /**
     * @param postID The ID of the post being flagged
     * @return No return value
     */
    public void flagPost(String postID) { return; };

    /**
     * @param commentID The ID of the comment being flagged
     * @return No return value
     */
    public void flagComment(String commentID) { return; };

    /**
     * @param postID The ID of the post being voted on
     * @return No return value
     */
    public void votePost(String postID) { return; };
}
