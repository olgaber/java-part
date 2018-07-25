package com.academy.lesson6;

import com.academy.lesson6.task.Currency;

public class CurrencyTests {
    public static void main(String[] args) {
        CurrencyTests test = new CurrencyTests();

        System.out.println("Constructor Test:");//done
        test.constructorTest();
        System.out.println();

        System.out.println("Copy Constructor Test: ");
        test.copyConstructorTest();
        System.out.println();

        System.out.println("Is Equal Test: "); //done
        test.isEqualTest();
        System.out.println();

        System.out.println("Add Test: ");//done
        test.addTest();
        System.out.println();

        System.out.println("Add Object Test: "); //done
        test.addTestObj();
        System.out.println();

        System.out.println("Subtract Test: "); //done
        test.subtractTest();
        System.out.println();

        System.out.println("Subtract Object Test: "); //done
        test.subtractTestObj();
        System.out.println();

        System.out.println("Divide Test: ");
        test.divideTest();
        System.out.println();

        System.out.println("Multiply Test: ");
        test.multiplyTest();
        System.out.println();
    }

    public void constructorTest() {
        Currency cur = new Currency(10, "руб.");

        assert cur.getValue() == 10;
        if (cur.getValue() == 10)
            System.out.println("Test 1 is successful");
        assert cur.getName().equals("руб.");
        if (cur.getName().equals("руб."))
            System.out.println("Test 2 is successful");
    }

    public void copyConstructorTest() {


    }

    public void isEqualTest() {
        Currency cur1 = new Currency(10, "руб");
        Currency cur2 = new Currency(10, "руб");
        Currency cur3 = new Currency(11, "руб");

        assert cur1.isEqual(cur2);
        if (cur1.isEqual(cur2))
            System.out.println("Test 1 is successful");
        assert !cur1.isEqual(cur3);
        if (!cur1.isEqual(cur3))
            System.out.println("Test 2 is successful");
    }

    public void addTest(){
        Currency cur1 = new Currency(150, "грн.");
        cur1.add(30, "грн.");

        assert cur1.getName().equals("грн.");
        if (cur1.getName().equals("грн."))
            System.out.println("Test 1 is successful");
        assert !cur1.getName().equals("руб.");
        if (!cur1.getName().equals("руб."))
            System.out.println("Test 2 is successful");
     }

    public void addTestObj(){
        Currency cur1 = new Currency(10, "руб.");
        Currency cur2 = new Currency(30, "руб.");
        cur1.add(cur2);

        assert cur1.getName().equals("руб.");
        if (cur1.getName().equals("руб."))
            System.out.println("Test 1 is successful");
        assert !cur2.getName().equals("$");
        if (!cur2.getName().equals("$"))
            System.out.println("Test 2 is successful");
    }

    public void subtractTest(){
        Currency cur1 = new Currency(150, "грн.");
        cur1.add(30, "грн.");

        assert cur1.getName().equals("грн.");
        if (cur1.getName().equals("грн."))
            System.out.println("Test 1 is successful");
        assert !cur1.getName().equals("$");
        if (!cur1.getName().equals("$"))
            System.out.println("Test 2 is successful");
    }

    public void subtractTestObj(){
        Currency cur1 = new Currency(10, "руб.");
        Currency cur2 = new Currency(30, "руб.");
        cur1.add(cur2);

        assert cur1.getName().equals("руб.");
        if (cur1.getName().equals("руб."))
            System.out.println("Test 1 is successful");
        assert !cur2.getName().equals("грн.");
        if (!cur2.getName().equals("$"))
            System.out.println("Test 2 is successful");
    }

    public void divideTest(){
        Currency cur1 = new Currency(10, "руб.");

        cur1.divide(5.78);
        cur1.divide(0.00);

    }

    public void multiplyTest(){
        Currency cur1 = new Currency(10, "руб.");

        cur1.multiply(1.258);

    }
}