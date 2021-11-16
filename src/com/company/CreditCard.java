package com.company;

public class CreditCard extends Card{

    //конструктор
    public CreditCard(long number, double sum) {
        super(number, sum);
    }

    @Override
    public String balance() {
        return super.balance();
    }
}
