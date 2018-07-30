package com.academy.lesson08.enumTask4;

public class Main {
    public static void main(String[] args) {

        Date.DateFormat d = Date.DateFormat.dd_MM_yyyy;
        System.out.println(d.toString());

        Date date = new Date();
        date.setDay(10);
        date.setMonth(5);
        date.setYear(2000);





    }
}
