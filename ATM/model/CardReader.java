package model;

import main.ATM;
import model.bank.BankService;

public class CardReader {
    private boolean cardInserted;
    private Card currentCard;

    private BankService bankService;
    private ATM atm;

    public CardReader(Card currentCard) {
        this.currentCard = currentCard;
    }

    public void insertCard() {
        System.out.println("Card inserted sucessfully.");
        cardInserted = true;
    }

    public Card readCard() {
        if (!cardInserted) {
            System.out.println("Card not inserted transaction terminated.");
        } else {
            System.out.println("Card  inserted successfully.");
            if (!atm.validateCard(currentCard)) {
                System.out.println("Card Expired.");
                System.out.println("Transaction terminated.");
            }
        }
        return currentCard;

    }

    public void ejectCard() {
        System.out.println("Card removed sucessfully.");
        cardInserted = false;
    }

    public boolean isCardInserted() {
        return cardInserted;
    }

}
