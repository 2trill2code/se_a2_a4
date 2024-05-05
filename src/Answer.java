// feel like this class as a whole should be an attribute in a question ?
public class Answer extends Post {
    private Question question;
    private boolean isBestAnswer;

    /**
     * @param postID The ID of the post to be marked as best answer
     * @return No return value
     */
    public void markAsBestAnswer(String postID) { };
}
