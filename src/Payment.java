import java.util.Date;

public class Payment {
    enum PaymentStatus { PAID, PENDING, PROCESSING };

    private Membership membership;

    private boolean automaticPayment;
    private Date paymentDue;
    private PaymentStatus status;

    /**
     * @param accountID The ID of the paying account
     * @return The payment option the account is using
     */
    public String paymentOption(String accountID) { return ""; };

    /**
     * @param void
     * @return boolean representing successful/unsuccessful bill creation
     */
    public boolean createBill() { return true; };

    /**
     * @param void
     * @return boolean The status of the payment, true if successful, false if not
     */
    public boolean processPayment() { return true; };
}
