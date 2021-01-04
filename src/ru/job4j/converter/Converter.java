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
        //евро на рубли, рубли на евро
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        euro = Converter.rubleToEuro(210);
        System.out.println("210 rubles are " + euro + " euro.");
        euro = Converter.rubleToEuro(700);
        System.out.println("700 rubles are " + euro + " euro.");

        int ruble = Converter.euroToRuble(5);
        System.out.println("5 euro are " + ruble + " rubles.");

        //доллары на рубли, рубли на доллары
        int dollar = Converter.rubleToDollar(180);
        System.out.println("180 rubles are " + dollar + " dollars.");
        dollar = Converter.rubleToDollar(120);
        System.out.println("120 rubles are " + dollar + " dollars.");
        dollar = Converter.rubleToDollar(240);
        System.out.println("240 rubles are " + dollar + " dollars.");

        ruble = Converter.dollarToRuble(115);
        System.out.println("115 dollars are " + ruble + " rubles.");

        //тестирование
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);

        in = 5;
        expected = 350;
        out = Converter.euroToRuble(in);
        passed = expected == out;
        System.out.println("5 euro are 350 rubles. Test result : " + passed);

        in = 180;
        expected = 3;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("180 rubles are 3 dollars. Test result : " + passed);

        in = 115;
        expected = 6900;
        out = Converter.dollarToRuble(in);
        passed = expected == out;
        System.out.println("115 dollars are 6900 rubles. Test result : " + passed);
    }
}
