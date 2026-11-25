package state;

import java.math.BigDecimal;

import model.Card;

import main.ATM;
import model.CardReader;

public class IdleState implements ATMstate {

    private final ATM atm;
    
    
    public IdleState(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void insertCard() {
       Card card = atm.getCardReader().readCard();
    }

    @Override
    public void enterPin(String pin) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'enterPin'");
    }

    @Override
    public void checkBalance() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'checkBalance'");
    }

    @Override
    public void withdraw(BigDecimal amount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'withdraw'");
    }

    @Override
    public void deposit(BigDecimal amount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deposit'");
    }

    @Override
    public void ejectCard() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ejectCard'");
    }
    
}
