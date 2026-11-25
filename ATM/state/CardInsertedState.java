package state;

import java.math.BigDecimal;

import main.ATM;
import model.Keypad;

public class CardInsertedState implements ATMstate{

    private final ATM atm;

    public CardInsertedState(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void insertCard() {
        throw new UnsupportedOperationException("Unimplemented method 'insertCard'");
    }

    @Override
    public void enterPin(String pin) {
       String PIN = atm.getKeypad().takeInput();
    }

    @Override
    public void checkBalance() {
        throw new UnsupportedOperationException("Unimplemented method 'checkBalance'");
    }

    @Override
    public void withdraw(BigDecimal amount) {
        throw new UnsupportedOperationException("Unimplemented method 'withdraw'");
    }

    @Override
    public void deposit(BigDecimal amount) {
        throw new UnsupportedOperationException("Unimplemented method 'deposit'");
    }

    @Override
    public void ejectCard() {
        throw new UnsupportedOperationException("Unimplemented method 'ejectCard'");
    }
    
}
