import java.util.List;

public class Question extends Post {
    private List<Answer> answers;
    
    private String title;
    private int numVotes;

    /**
     * @param postID The ID of the post being selected as helpful
     * @return No return value
     */
    public void selectHelpfulAnswer(String postID) { return; };
}
