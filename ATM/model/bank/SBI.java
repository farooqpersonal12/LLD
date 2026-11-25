package model.bank;

import java.math.BigDecimal;

import model.Card;

public class SBI implements BankService{

    @Override
    public boolean validateCard(Card card) {
        return card.isExpired();
    }

    @Override
    public boolean authenticatePin(Card card, String pin) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'authenticatePin'");
    }

    @Override
    public BigDecimal checkBalance(BankAccount account) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'checkBalance'");
    }

    @Override
    public boolean withdraw(BankAccount account, BigDecimal amount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'withdraw'");
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
    
}
