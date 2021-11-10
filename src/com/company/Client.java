package com.company;

public class Client extends Person{

    long ID;

    //Конструктор
    public Client(String name, String phoneNumber, String email, int age, String sex,long ID) {
        super(name, phoneNumber, email, age, sex);
        this.ID = ID;
    }

    //предоставление информации о клиенте
    @Override
    public String printInfo() {
        return super.printInfo() + "\nID: " + this.ID;
    }
}
