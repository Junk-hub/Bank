package com.company;

public class Main {

    //Метод main временно служит тестовым методом
    public static void main(String[] args) {
        Person person1 = new Person("Ilia", "89778116787", "1@.ru", 19, "male");
        System.out.println(person1.printInfo());
        System.out.println("---------------------------------------");

        Client client1 = new Client("Dmitriy", "89037471972", "2@.ru", 18, "m",987654);
        System.out.println(client1.printInfo());
        System.out.println("---------------------------------------");

        Employee employee1 = new Employee("Sergei", "89778556787", "3@.ru", 40,"",3000.0, "consultant");
        System.out.println(employee1.printInfo());
        System.out.println("---------------------------------------");

        SavingAccount savingAccount1 = new SavingAccount(0, 3);
        savingAccount1.predictSum(10, 9);

        //TASK-19
        //19 - Пытаемся закрыть счет, если на нем есть средства, выдаем сообщение
        try {
            savingAccount1.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("---------------------------------------");
        Card card1 = new Card(1234567891, 600000);
        System.out.println(card1.balance());

        System.out.println("---------------------------------------");
        Loan loan1 = new Loan(15000000.0, 2.4, 16, 37000, "Car");
        System.out.println(loan1.showInfo());
    }
}
