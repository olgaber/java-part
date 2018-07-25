package com.academy.lesson6.demo;

import com.academy.lesson6.demo.Button;
import com.academy.lesson6.task.Currency;

public class Demo {
    public static void main(String[] args) {
        Button btn = new Button();
        btn.setText("Log in");
        System.out.println(btn.getText());

        Currency cur1 = new Currency(100, "руб.");
        Currency cur2 = new Currency(cur1);

        cur1.print();
        cur2.print();
    }
}
