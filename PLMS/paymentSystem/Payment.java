package paymentSystem;

public class Payment {
    private double amount;
    private PaymentSystem paymentSystem;

    public Payment(double amount, PaymentSystem paymentSystem) {
        this.amount = amount;
        this.paymentSystem = paymentSystem;
    }

    public void processPayment() {
        if (amount > 0) {
            paymentSystem.processPayment(amount);
        } else {
            System.out.println("Invalid payment amount.");
        }
    }

}