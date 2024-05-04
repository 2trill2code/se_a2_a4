import java.util.ArrayList;
import java.util.Date;

public abstract class Post {
    private String postID;
    private Date postDate;
    private int numVotes;
    private String title;
    private String content;
    private String author; // think this should be a reference to the accountID
    private boolean flagged;
    private ArrayList<Comment> comments;

    public void editPost(String postID) { }; // does this need a param if its just editing itself?
    public void notifyPoster(String accountID) { }; // same with this
    public void addFlag(String postID) { };
    public void upvotePost(String postID) { };
    public void downvotePost(String postID) { };



}
