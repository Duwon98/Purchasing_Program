package com.company;

public class MotherBoard implements Item{
    final int PRICE = 150;
    int amount;

    public MotherBoard(int amount) {
        this.amount = amount;
    }

    @Override
    public double getPrice() {
        return PRICE * amount;
    }
}
