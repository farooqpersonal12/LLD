package state;

import java.math.BigDecimal;

import main.ATM;
import model.bank.BankAccount;

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

        BigDecimal balance = atm.getBankService()
                .checkBalance(atm.getBankService().getBankAccount(atm.getCardReader().getCard()));
        atm.getScreen().DisplayBalance(balance);
    }

    @Override
    public void withdraw(BigDecimal amount) {
        boolean success = atm.getBankService()
                .withdraw(atm.getBankService().getBankAccount(atm.getCardReader().getCard()), amount);
        if (success) {
            BankAccount account = atm.getBankService()
                    .getBankAccount(atm.getCardReader().getCard());
            BigDecimal newBalance = atm.getBankService().checkBalance(account);
            atm.getScreen().DisplaySuccessfullWithdrawMessage(amount, newBalance);
        }else{
            
        }
    }

    @Override
    public void deposit(BigDecimal amount) {
        atm.getBankService().deposit(atm.getBankService().getBankAccount(atm.getCardReader().getCard()), amount);
    }

    @Override
    public void ejectCard() {
        atm.getCardReader().ejectCard();
        atm.setState(new IdleState(atm));
    }

    public void transactionSession() {
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
