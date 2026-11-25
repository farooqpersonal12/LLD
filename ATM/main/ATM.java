package main;

import java.math.BigDecimal;

import model.*;
import model.bank.*;
import state.*;

public class ATM {
    private String atmID;
    private ATMstate Curentstate;

    private CardReader cardReader;
    private Keypad keypad;
    private Screen screen;
    private CashDispenser cashDispenser;
    private ReceiptPrinter receiptPrinter;

    private BankService bankServivce;

    public ATM(String atmID, ATMstate curentstate, CardReader cardReader, Keypad keypad, Screen screen,
            CashDispenser cashDispenser, ReceiptPrinter receiptPrinter, BankServivce bankServivce) {
        this.atmID = atmID;
        Curentstate = curentstate;
        this.cardReader = cardReader;
        this.keypad = keypad;
        this.screen = screen;
        this.cashDispenser = cashDispenser;
        this.receiptPrinter = receiptPrinter;
        this.bankServivce = bankServivce;
    }

    public void setState(ATMstate state) {
        this.Curentstate = state;
    }

    public ATMstate getCurrentState() {
        return Curentstate;
    }

    public void insertCard();

    public void enterPin(String pin);

    public void checkBalance();

    public void withdraw(BigDecimal amount);

    public void deposit(BigDecimal amount);

    public void ejectCard();

    public void startSession() {

    }

    public void endSession();

    public boolean validateCard(Card card) {
        boolean isValidCard = bankServivce.validateCard(card);
    }

    public CardReader getCardReader() {
        return cardReader;
    }
}
