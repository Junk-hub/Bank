package com.company;

import java.util.HashMap;

public class Client extends Person{

    long ID;
    //TASK-21
    //21 - ассоциативный список служит хранилищем недавних транзакций в виде: ID номер клиента, с которым была
    //произведена транзакция + сумма транзакции
    HashMap<Long, Double> recentTransfers;

    //Конструктор
    public Client(String name, String phoneNumber, String email, int age, String sex, long ID, HashMap<Long, Client> clients) {
        super(name, phoneNumber, email, age, sex);
        this.ID = ID;

        //заносим данного клиента в общую базу
        clients.put(this.ID, this);
        //создаем массив недавних операций для данного пользователя
        this.recentTransfers = new HashMap<>();
    }

    //предоставление информации о клиенте
    @Override
    public String printInfo() {
        return super.printInfo() + "\nID: " + this.ID;
    }
}
