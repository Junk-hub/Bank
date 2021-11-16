package com.company;

public class DebitCard extends Card{

    //конструктор
    public DebitCard(long number, double sum) {
        super(number, sum);
    }

    @Override
    public String balance() {
        return super.balance();
    }
}
