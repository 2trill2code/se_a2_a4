public class CommunityPost extends Post {
    private String title;
    private boolean isEndorsed;

    /**
     * @param setHide Sets visibility of votes
     * @return No return value
     */
    public void hideVoting(boolean setHide) { return; };

    /**
     * @param setHide Sets visibility of comments
     * @return No return value
     */
    public void hideComments(boolean setHide) { return; };

    /**
     * @param numVotes The number of votes which determines endorsement
     * @return No return value
     */
    public void endorsed(int numVotes) { return; };
}
