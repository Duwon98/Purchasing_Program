package com.company;

public class HDD implements Item{
    final int PRICE = 300;
    private int amount;

    public HDD(int amount) {
        this.amount = amount;
    }

    @Override
    public double getPrice() {
        return PRICE * amount;
    }
}
