package com.company;

import java.util.HashMap;

public class SavingAccount extends Account{

    //конструктор
    public SavingAccount(double sum, double percent) {
        super(sum, percent);
    }

    //Метод для расчета сложного процента и прогнозирования дохода к определенной дате
    //n - количество начислений в течение года
    //t - кол-во лет начисления процентов
    public void predictSum(int n, int t){

        //TASK-18
        //18 - обработка исключения при делении на ноль
        try {
            if (percent/n == Double.POSITIVE_INFINITY ||
                    percent/n == Double.NEGATIVE_INFINITY)
                throw new ArithmeticException();

            this.sum = this.sum * Math.pow((1+percent/n), (n*t));
            System.out.println("Новая сумма на счету: " + this.sum);

        } catch (ArithmeticException ae) {
            System.out.println("ОШИБКА! Производилось деление на 0, проверьте кол-во начислений в течение года");
        }
    }


    //TASK-19
    //19 - описание пользовательского исключения. Если на счету остались средства, то его нельзя закрывать
    public void close() throws Exception {
        if (this.sum > 0) throw new Exception("На счету еще остались средства." +
                                            "\n Выведите их перед закрытием счета");

        System.out.println("Счет успешно закрыт");
        //TODO - описать удаление счета из списка
    }

    public void topUp(double sum, boolean approved, String comment, Client sender, Client recipient, HashMap<Long, Client> clients){

        /*Long senderID = null, recipientID = null;
        for (int i = 0; i < clients.size(); i++){
            if (sender == clients.get(i))
                senderID = clients.get(i).ID;
            if (recipient == clients.get(i))
                recipientID = clients.get(i).ID;
        }

        Transfer transfer = new Transfer(sum, approved, comment, senderID, recipientID);*/
        if (sum > 10){
            if (approved == true){
                    sender.recentTransfers.put(recipient.ID, sum);
                    recipient.recentTransfers.put(sender.ID, sum);

            }
            else System.out.println("К сожалению, платеж не подтвержден");
        }
        else System.out.println("Сумма перевода должна быть больше 10 рублей");
    }
}
