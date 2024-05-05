import java.util.List;

public class Admin extends Moderator {
    private List<Task> taskLog;
    
    private String adminID;
    private String role; // enum type ???
    
    /**
     * @param accountID The ID of the account to be accessed
     * @return No return value
     */
    public void accessUserDetails(String accountID) { return; };

    /**
     * @param accountID The ID of the account to be promoted
     * @return No return value
     */
    public void promoteToMod(String accountID) { return; };

    /**
     * @param modID The ID of the mod to be demoted
     * @return No return value
     */
    public void demoteFromMod(String modID) { return; }; // accountID should be modID ???
}
