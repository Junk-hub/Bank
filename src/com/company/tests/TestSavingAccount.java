package com.company.tests;

import com.company.SavingAccount;

public class TestSavingAccount {
    public static void main(String[] args) {

        SavingAccount savingAccount1 = new SavingAccount(0, 3);
        savingAccount1.predictSum(10, 9);

        //TASK-19
        //19 - Пытаемся закрыть счет, если на нем есть средства, выдаем сообщение
        try {
            savingAccount1.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
