package state;

import java.math.BigDecimal;

import main.ATM;

public class CardInsertedState implements ATMstate {

    private final ATM atm;

    public CardInsertedState(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void insertCard() {
        throw new UnsupportedOperationException("Unimplemented method 'insertCard'");
    }

    @Override
    public void enterPin() {
        String PIN = atm.getKeypad().takeInput();

        if (atm.getBankService().authenticatePin(atm.getCardReader().readCard(), PIN)) {
            atm.getScreen().DisplayPINAuthenticatedMessage();
            atm.setState(new AuthenticatedState(atm));
            atm.getScreen().DisplayTransaction();
        }else{
            atm.getScreen().DisplayIncorrectPINMessage();
            ejectCard();
        }
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
        atm.getCardReader().ejectCard();
        atm.setState(new IdleState(atm));
    }

}
