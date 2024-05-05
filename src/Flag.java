public class Flag {
    enum FlagStatus { UNHELPFUL, SPAM, OFFENSIVE };

    private Post post;
    private Comment comment;

    private String flaggedPostID;
    private String flaggedAccountID;
    private FlagStatus flag;

    /**
     * @param void
     * @return The post ID that's been flagged
     */
    public String getPostID() {
        return this.flaggedPostID;
    }

    /**
     * @param void
     * @return The account ID that's been flagged
     */
    public String getFlaggedAccountId() {
        return this.flaggedAccountID;
    }
}
