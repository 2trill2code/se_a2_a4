public class Account {
    enum accountType { NONE, SILVER, GOLD }; // idk to keep we have membershipType already

    private String accountID;
    private String username; // added
    private String email;
    private String password;

    public void viewPost() { };
    public void createPost() { };
    public void answerQuestion() { };
    public void makeComment() { };
    public void flagComment() { };
    public void votePost() { };
}
