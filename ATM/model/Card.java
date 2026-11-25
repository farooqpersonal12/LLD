package model;

import java.time.LocalDate;

public class Card {
    private String cardNumber;
    private String cardHolderName;
    private LocalDate expiryDate;
    private String bankIdentifier;

    public Card(String cardNumber, String cardHolderName, LocalDate expiryDate, String bankIdentifier) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expiryDate = expiryDate;
        this.bankIdentifier = bankIdentifier;
    }

    public boolean isExpired() {
        return expiryDate.isBefore(LocalDate.now());
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public String getBankIdentifier() {
        return bankIdentifier;
    }

}
