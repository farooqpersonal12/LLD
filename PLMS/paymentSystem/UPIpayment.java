package paymentSystem;

public class UPIpayment implements PaymentSystem {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI Payment of Rs.: " + amount);
    }
    
}
