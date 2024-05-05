import java.util.List;
import java.util.Date;

public class Comment {
    private String commentID;
    private String content;
    private String author;
    private Date postDate;
    private List<Flag> flags;
    private int numVotes;

    /**
     * @param void
     * @return No return value
     */
    public void changeVote(int vote) { return; };

    /**
     * @param accountID
     * @return No return value
     */
    public void notifyPoster(String accountID) { return; }; 
}

