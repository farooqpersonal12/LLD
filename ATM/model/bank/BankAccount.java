package model.bank;

import java.math.BigDecimal;

import enums.AccuontStatus;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private String bankName;
    private BigDecimal balance;
    private AccuontStatus status;
    
    public BankAccount(String accountNumber, String accountHolderName, String bankName, BigDecimal balance,
            AccuontStatus status) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.bankName = bankName;
        this.balance = balance;
        this.status = status;
        this.status = AccuontStatus.ACTIVE;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getBankName() {
        return bankName;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public AccuontStatus getStatus() {
        return status;
    }

    

    

}
