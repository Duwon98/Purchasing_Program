package com.company;

public class Card {
    private int cardNumber;
    private String validDate;
    private int CVV;

    public Card(int cardNumber, String validDate, int CVV) {
        this.cardNumber = cardNumber;
        this.validDate = validDate;
        this.CVV = CVV;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getValidDate() {
        return validDate;
    }

    public void setValidDate(String validDate) {
        this.validDate = validDate;
    }

    public int getCVV() {
        return CVV;
    }

    public void setCVV(int CVV) {
        this.CVV = CVV;
    }
}
