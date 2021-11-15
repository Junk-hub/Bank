package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        //TASK-21
        //21 - создаем ассоциативный массив, в котором будем хранить ID номер клиента и указатель на объект - клиента
        HashMap<Long, Client> clients = new HashMap<>();

        Client client1 = new Client("Dmitriy", "89037471972", "1@.ru", 18, "m",1, clients);
        System.out.println(client1.printInfo());
        System.out.println("---------------------------------------");

        Client client2 = new Client("Ilia", "89778116787", "2@.ru", 18, "m", 2, clients);
        System.out.println(client2.printInfo());
        System.out.println("---------------------------------------");

        System.out.println(clients);

        SavingAccount savingAccount = new SavingAccount(2500, 3.4);
        savingAccount.topUp(2000, true, "", client2, client1, clients);

        System.out.println(client2.recentTransfers);
        System.out.println(client1.recentTransfers);

    }
}
