import java.util.Date;
import java.util.List;

public class Comment {
    private List<Flag> flags; // if there is a flag class should this be a flag type?
    private Post post;

    private String commentID;
    private String accountID; // accountID ?
    private Date postDate;
    private String content;
    private long numVotes; // change to long

    /**
     * @param void
     * @return No return value
     */
    public void editComment() { return; }; // does this need a param if its just editing itself?

    /**
     * @param void
     * @return No return value
     */
    public void addFlag() { return; };

    /**
     * @param void
     * @return No return value
     */
    public void upvoteComment() { return; };

    /**
     * @param void
     * @return No return value
     */
    public void downvoteComment() { return; };

}
