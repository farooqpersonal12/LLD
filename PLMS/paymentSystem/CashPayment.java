package paymentSystem;

public class CashPayment implements PaymentSystem{
    

    public CashPayment() {
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Cash of Rs.:  "+amount);
    }

}
