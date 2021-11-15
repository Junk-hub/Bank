package com.company.tests;

import com.company.Card;

public class TestCard {
    public static void main(String[] args) {
        System.out.println("---------------------------------------");
        Card card1 = new Card(1234567891, 600000);
        System.out.println(card1.balance());
    }
}
