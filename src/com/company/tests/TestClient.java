package com.company.tests;

import com.company.Client;

public class TestClient {
    public static void main(String[] args) {
        Client client1 = new Client("Dmitriy", "89037471972", "2@.ru", 18, "m",987654);
        System.out.println(client1.printInfo());
        System.out.println("---------------------------------------");
    }
}
