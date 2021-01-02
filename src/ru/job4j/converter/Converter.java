package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int euroToRuble(int value) {
        return value * 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60; /* формула перевода рублей в доллары. */
    }

    public static int dollarToRuble(int value) {
        return value * 60;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        euro = Converter.rubleToEuro(210);
        System.out.println("210 rubles are " + euro + " euro.");
        euro = Converter.rubleToEuro(700);
        System.out.println("700 rubles are " + euro + " euro.");

        int dollar = Converter.rubleToDollar(180);
        System.out.println("180 rubles are " + dollar + " dollars.");
        dollar = Converter.rubleToDollar(120);
        System.out.println("120 rubles are " + dollar + " dollars.");
        dollar = Converter.rubleToDollar(240);
        System.out.println("240 rubles are " + dollar + " dollars.");

        int ruble = Converter.euroToRuble(5);
        System.out.println("5 euro are " + ruble + " rubles.");
        ruble = Converter.dollarToRuble(115);
        System.out.println("115 dollars are " + ruble + " rubles.");
    }
}
