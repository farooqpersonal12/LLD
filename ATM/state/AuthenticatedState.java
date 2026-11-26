package state;

import java.math.BigDecimal;

import main.ATM;

public class AuthenticatedState implements ATMstate {

    private final ATM atm;

    public AuthenticatedState(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void insertCard() {
        throw new UnsupportedOperationException("Unimplemented method 'insertCard'");
    }

    @Override
    public void enterPin() {
        throw new UnsupportedOperationException("Unimplemented method 'enterPin'");
    }

    @Override
    public void checkBalance() {
        atm.getBankService().checkBalance(atm.getCardReader().getBankAccount());
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

    public void transactionSession(){
        atm.getScreen().DisplayTransactionTpres();
        String selectTransactionType = atm.getKeypad().TakeTransactionInput();
        switch (selectTransactionType) {
            case "1":
                checkBalance();
                break;
            case "2":
                atm.getScreen().DisplayEnterAmount();
                BigDecimal amount = atm.getKeypad().takeAmountInput();
                withdraw(amount);
                break;
            case "3":
                atm.getScreen().DisplayEnterAmount();
                BigDecimal amt = atm.getKeypad().takeAmountInput();
                deposit(amt);
                break;
        
            default:
                atm.getScreen().DisplayInvalidTransactionSelected();
                break;
        }
    }
    
}
