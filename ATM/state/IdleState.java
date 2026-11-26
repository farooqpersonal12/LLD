package state;

import java.math.BigDecimal;

import model.Card;

import main.ATM;

public class IdleState implements ATMstate {

    private final ATM atm;

    public IdleState(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void insertCard() {
        Card card = atm.getCardReader().readCard();

        if (card == null) {
            atm.getScreen().DisplayNullCardRead();
            ejectCard();
            return;
        }

        if (card.isExpired() || !atm.validateCard(card)) {
            atm.getScreen().DisplayInvalidOrExpiredCard();
            ejectCard();
            return;
        }
        atm.setState(new CardInsertedState(atm));
        atm.getScreen().DisplayCardAccepted();
    }

    @Override
    public void enterPin() {
        throw new UnsupportedOperationException("Unimplemented method 'enterPin'");
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
