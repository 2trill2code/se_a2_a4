public class Payment {
    enum PaymentStatus { PAID, PENDING, PROCESSED };

    private boolean automaticPayment;
    private String paymentDue;
    private PaymentStatus status;

    public void paymentOption() {};
    public void createBill() {};
    public void processPayment() {};
}
