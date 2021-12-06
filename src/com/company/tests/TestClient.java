package com.company.tests;

import com.company.Client;

import java.util.HashMap;

public class TestClient {
    public static void main(String[] args) {
        //TASK-27
        //27 - пример использования HashMap для хранения информации о пользователях
        HashMap<Long, Client> clients = new HashMap<>();


        Client client1 = new Client("Dmitriy", "89037471972", "2@.ru", 18, "m",987654, clients);
        System.out.println(client1.printInfo());
        System.out.println("---------------------------------------");
    }
}
