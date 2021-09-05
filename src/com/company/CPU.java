package com.company;

public class CPU implements Item{
    final int PRICE = 500;
    int amount;

    public CPU(int amount) {
        this.amount = amount;
    }

    @Override
    public double getPrice() {
        return PRICE * amount;
    }
}
