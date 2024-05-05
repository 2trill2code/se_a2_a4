public class Flag {
    enum FlagStatus { UNHELPFUL, SPAM, OFFENSIVE };
    
    private String postFlagged;
    private String flaggedBy;
    private FlagStatus flag;

    /**
     * @param postFlagged ID of the post that was flagged
     * @param flaggedBy the ID of the account
     * @param flag the status of the flag
     * @return void
     */
    public void setFlag(String postFlagged, String flaggedBy, FlagStatus flag) {
        this.postFlagged = postFlagged;
        this.flaggedBy = flaggedBy;
        this.flag = flag;
    };

    /**
     * @param void
     * @return The post ID that's been flagged
     */
    public String getPostID() {        
        return this.postFlagged;
    };
}
