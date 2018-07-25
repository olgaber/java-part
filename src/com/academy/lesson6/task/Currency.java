package com.academy.lesson6.task;

/*Класс Currency для работы с денежными суммами.
        - Класс должен быть представлен двумя private полями:
        double value; для хранения значания суммы
        String name; для хранения названия валюты ("грн", "руб", "$")

        Реализовать 2 конструктора:
        - без параметров
        - и с двумя параметрами, которые принимает (double value, String name);
        - конструктор копирования: (Currency currency)

        - Реализовать метод отображения суммы на экран print();
        Напр. в виде: 154.65руб // отображать не более 2 знаков после запятой

        - Реализовать операцию сравнения:
        boolean isEqual(Currency currency); // вернет true, если и значение и строка - совпадают

        - Реализовать методы:
        void add(double value, String name); // метод сложения
        (если name отличается от текущего поля 'name', то сложение не производить,
        а вывести сообщение об ошибке ("Error: currency names are differ 'грн' - 'руб')
        void add(Currency currency); // метод сложения

        void substract(double value, String name); // метод вычитания ...
        void substract(Currency currency);

        void divide(double factor); // деление суммы на число
        void multiply(double factor); // умножение суммы на число

        3б) Реализовать класс TestCurrency, который тестирует функционал класса Currency из предыдущей задачи:
        - проверить работу конструкторов
        - проверить работу методов сложения, вычитаня, деления и умножения
        - проверить работу метода isEqual
        Напр. метод тестирования сложения может иметь следующую сигнатуру:
public boolean testAdd() {
        // код теста...
        return true; // eсли тест успешный или 'false', если не успешный
        }

        - все тесты запускаются в функции main
        - каждые тест - отдельная функция - void testIsEqual(), void testDefaultConstructor() и т.д.
        - в процессе тестирования выводить информацию о ходе теста на консоль
        - * реализовать возможность запускать выборочно тесты в диалоговом режиме (или через аргумент командной строки)*/

public class Currency {

    private double value;
    private String name;  ///("грн", "руб", "$")

    // TODO check
    public Currency(double value, String name) {
        this.value = value;
        this.name = name;
    }

    public Currency(Currency other) {
        this.value = other.value;
        this.name = other.name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    // TODO check
    public boolean setName(String name) {
        this.name = name;
        if(!this.name.equals("грн.") || !this.name.equals("руб.") || !this.name.equals("$")){
            System.out.println("Currency name is incorrect");
            return false;
        }
        else
            return true;
    }

    public void print() {
        System.out.println(String.format("%.2f%s", value, name));
    }

    public boolean isEqual(Currency other) {
        if (this.value != other.value)
            return false;

        if (!this.name.equals(other.name))
            return false;

        return true;
    }

    //math methods

    public void add(double value, String name){

        if (this.name.equals(name)){
            this.value += value;
            //System.out.println(this.value);
        }
        else {
            System.out.println("Error: currency names differ: " + this.name + "-" + name);
        }

    }
    public void add(Currency currency){
        if (this.name.equals(currency.name)){
            this.value += currency.value;
            //System.out.println(this.value);
        }
        else {
            System.out.println("Error: currency names differ: " + this.name + "-" + name);
        }
    }

    public void subtract(double value, String name){

        if (this.name.equals(name)){
            this.value -= value;
            //System.out.println(this.value);
        }
        else {
            System.out.println("Error: currency names differ: " + this.name + "-" + name);
        }

    }
    public void subtract(Currency currency){
        if (this.name.equals(currency.name)){
            this.value -= currency.value;
            //System.out.println(this.value);
        }
        else {
            System.out.println("Error: currency names differ: " + this.name + "-" + name);
        }
    }

    public void divide(double factor){

        if (factor != 0.00){
            this.value /= factor;
            System.out.println("Result of division: " + this.value);
        }
        else {
            System.out.println("Error: Value can't be divided by zero");

        }

    }

    public void multiply(double factor){
        this.value *= factor;
        System.out.println("Result of multiplying: " + this.value);

    }
}
