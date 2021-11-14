package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.SimpleTimeZone;

public class Card {
    private long number;
    private double sum;
    //Task-20
    //20 - добавление даты, до которой будет действительна и активна карта
    private Date expiration;

    public Card(long number, double sum){
        this.number = number;
        this.sum = sum;

        //20 - Создание даты
        Date date = new Date();
        //20 - создание объекта для удобной работы с датами
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        //20 - прибавляем к созданной дате 4 года и получаем срок, до которого активна карта
        calendar.add(Calendar.YEAR, 4);
        //20 - обновляем переменную с датой
        date = calendar.getTime();
        this.expiration = date;
    }

    public String balance(){
        //20 - создание формата для даты и времени, чтобы выводить их в удобном формате
        //и отмести ненужную информацию
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/yy");

        return "Info about card #" + this.number +
                "\n" + "Balance: " + this.sum +
                "\n" + "Validity period: " + simpleDateFormat.format(this.expiration);
    }
}
