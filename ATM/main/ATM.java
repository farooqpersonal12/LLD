package main;

import java.math.BigDecimal;

import model.*;
import model.bank.*;
import state.*;

public class ATM {
    private String atmID;
    private ATMstate Currentstate;

    private CardReader cardReader;
    private Keypad keypad;
    private Screen screen;
    private CashDispenser cashDispenser;
    private ReceiptPrinter receiptPrinter;

    private BankService bankService;

    public ATM(String atmID, ATMstate currentstate, CardReader cardReader, Keypad keypad, Screen screen,
            CashDispenser cashDispenser, ReceiptPrinter receiptPrinter, BankServivce bankServivce, Card card) {
        this.atmID = atmID;
        Currentstate = currentstate;
        this.cardReader = cardReader;
        this.keypad = keypad;
        this.screen = screen;
        this.cashDispenser = cashDispenser;
        this.receiptPrinter = receiptPrinter;
        this.bankService = bankService;
    }

    public void setState(ATMstate state) {
        this.Currentstate = state;
    }

    public ATMstate getCurrentState() {
        return Currentstate;
    }

    public void insertCard() {
        Currentstate.insertCard();
    }

    public void enterPin() {
        Currentstate.enterPin();
    }

    public void checkBalance() {
        Currentstate.checkBalance();
    }

    public void withdraw(BigDecimal amount) {
        Currentstate.withdraw(amount);
    }

    public void deposit(BigDecimal amount) {
        Currentstate.deposit(amount);
    }

    public void ejectCard() {
        Currentstate.ejectCard();
    }

    public void startSession() {
    }

    public void endSession() {
    }

    public boolean validateCard(Card card) {
        boolean isValidCard = bankService.validateCard(card);
    }

    public CardReader getCardReader() {
        return cardReader;
    }

    public Screen getScreen() {
        return screen;
    }

    public Keypad getKeypad() {
        return keypad;
    }

    public BankService getBankService() {
        return bankService;
    }
}
