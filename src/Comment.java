import java.util.Date;

public class Comment {
    private String commentID;
    private String content;
    private String author; // accountID ?
    private Date postDate;
    private boolean flagged; // if there is a flag class should this be a flag type?
    private int numVotes; // change to long

    public void editComment(String postID) { }; // does this need a param if its just editing itself?
    public void addFlag(String postID) { };
    public void upvoteComment(String postID) { };
    public void downvoteComment(String postID) { };

}
