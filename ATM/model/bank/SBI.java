package model.bank;

import java.math.BigDecimal;
import java.util.ArrayList;

import model.Card;

public class SBI implements BankService {

    @Override
    public boolean validateCard(Card card) {
        return card.isExpired();
    }

    ArrayList<BankAccount> accounts = new ArrayList<>();

    @Override
    public boolean authenticatePin(Card card, String pin) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'authenticatePin'");
    }

    @Override
    public BigDecimal checkBalance(BankAccount account) {

        for (BankAccount bankAccount : accounts) {
            if (account.getAccountNumber().equals(bankAccount.getAccountNumber())) {
                return bankAccount.getBalance();
            }
        }
        return null;
    }

    @Override
    public boolean withdraw(BankAccount account, BigDecimal amount) {
        
    }

    @Override
    public boolean deposit(BankAccount account, BigDecimal amount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deposit'");
    }

    @Override
    public boolean transfer(BankAccount from, BankAccount to, BigDecimal amount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'transfer'");
    }

    // @Override
    // public BankAccount getBankAccount(Card card) {

    // }

}
