import java.util.Date;

public class Payment {
    enum PaymentStatus { PAID, PENDING, PROCESSED };

    private Membership membership;

    private boolean automaticPayment;
    private Date paymentDue;
    private PaymentStatus status;

    /**
     * @param accountID The ID of the paying account
     * @return The payment option the account is using
     */
    public String paymentOption(String accountID) { return ""; };
    public void createBill() {};
    public void processPayment() {};
}
