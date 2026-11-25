package model;

public class Screen {

    public void DisplayCardAccepted() {
        System.out.println("Card accepted. Please enter your PIN.");
    }
    
    public void DisplayNullCardRead(){
        System.out.println("No data read from card. Please try again.");
    }

    public void DisplayInvalidOrExpiredCard(){
        System.out.println("Invalid/expired card. Ejecting.");
    }

    public void DisplayEnterPINMessage(){
        System.out.println(" Please enter your PIN : ");
    }
}
