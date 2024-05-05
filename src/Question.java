import java.util.List;

public class Question extends Post {
    private List<Answer> answers;
    
    private String title;
    private int numVotes;

    /**
     * @param modID The ID of the mod deleting the answer
     * @param postID The ID of the answer being deleted
     * @return No return value
     */
    public void deleteAnswer(String modID, String postID) { return; }; // feel like this should be in the mod class
}
