public class Flag {
    enum FlagStatus { UNHELPFUL, SPAM, OFFENSIVE };

    private String postIDFlagged;
    private String flaggedAccountID;
    private FlagStatus flag;

    public String getPostID() {
        return this.postIDFlagged;
    }

    public String getFlaggedAccountId() {
        return this.flaggedAccountID;
    }
}
