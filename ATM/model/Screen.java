package model;

public class Screen {

    public void DisplayCardAccepted() {
        System.out.println("Card accepted. Please enter your PIN.");
    }

    public void DisplayNullCardRead() {
        System.out.println("No data read from card. Please try again.");
    }

    public void DisplayInvalidOrExpiredCard() {
        System.out.println("Invalid/expired card. Ejecting.");
    }

    public void DisplayEnterPINMessage() {
        System.out.println(" Please enter your PIN : ");
    }

    public void DisplayPINAuthenticatedMessage() {
        System.out.println("PIN authenticated successfully");
    }

    public void DisplayIncorrectPINMessage() {
        System.out.println("Incorrect PIN detected. Transaction terminated.");
    }

    public void DisplayTransaction() {
        System.out.println("Select Transaction: ");

    }

    public void DisplayTransactionTpres() {
        System.out.print("1.Check Balance");
        System.out.print("2.Withdraw");
        System.out.print("3.Deposite");
        System.out.println("Please enter number : ");
    }

    public void DisplayInvalidTransactionSelected() {
        System.out.println("Invalid transaction selected");
    }

    public void DisplayEnterAmount() {
        System.out.println("Please enter amount for withdraw : ");
    }

    public void DisplayInvalidAmountEnterMessage() {
        System.out.println("Invalid amount. Please enter a number.");
    }
    

}
