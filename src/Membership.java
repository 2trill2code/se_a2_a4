import java.util.List;

public class Membership {
    public enum MembershipType { NONE, SILVER, GOLD }

    private List<Account> memberships;
    private Payment payment;
    
    private int fileSizeLimit;
    private int imageSizeLimit;
    private MembershipType membership;

    /**
     * @param newSize The maximum file size that can be uploaded
     * @return No return value
     */
    public void setFileSizeLimit(int newSize) { return; };

    /**
     * @param newSize The maximum image size that can be uploaded
     * @return No return value
     */
    public void setImageSizeLimit(int newSize) { return; };
}
