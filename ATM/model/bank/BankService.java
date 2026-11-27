package model.bank;

import java.math.BigDecimal;

import model.Card;

public interface BankService {
    boolean validateCard(Card card);
    boolean authenticatePin(Card card, String pin);
    BigDecimal checkBalance(BankAccount account);
    boolean withdraw(BankAccount account, BigDecimal amount);
    boolean deposit(BankAccount account, BigDecimal amount);
    boolean transfer(BankAccount from, BankAccount to, BigDecimal amount);
    BankAccount getBankAccount(Card card);

}
