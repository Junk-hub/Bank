package com.company;

public class SavingAccount extends Account{

    //конструктор
    public SavingAccount(double sum, double percent) {
        super(sum, percent);
    }

    //Метод для расчета сложного процента и прогнозирования дохода к определенной дате
    //n - количество начислений в течение года
    //t - кол-во лет начисления процентов
    public void predictSum(int n, int t){

        //TASk-18
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
    protected void close() throws Exception {
        if (this.sum > 0) throw new Exception("На счету еще остались средства." +
                                            "\n Выведите их перед закрытием счета");

        System.out.println("Счет успешно закрыт");
        //TODO - описать удаление счета из списка
    }
}
