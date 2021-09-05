package com.company;

public class Memory implements Item{
    final int PRICE = 200;
    private int amount;

    public Memory(int amount) {
        this.amount = amount;
    }

    @Override
    public double getPrice() {
        return PRICE * amount;
    }
}
