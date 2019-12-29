package ru.job4j.converter;

public class ConwerterWork {
    private static int dollar = 60;
    private static int euro = 70;

    public static int rubleToEuro(int value) {
        return value / euro;
    }
    public static int rubleToDollar(int value) {
        return value / dollar;
    }
    public static int euroToRuble(int value) {
        return value * euro;
    }
    public static int dollarToRuble(int value) {
        return value * dollar;
    }
    public static void main(String[] args) {
        int euror = rubleToEuro(140);
        System.out.println("140 rubles are " + euror + " euro.");
        int dollars = rubleToDollar(120);
        System.out.println("120 rubles are " + dollars + " dollars.");
        int rubles = euroToRuble(3);
        System.out.println("3 euro are " + rubles + " rubles.");
        int rublesd = dollarToRuble(4);
        System.out.println("4 dollars are " + rublesd + " rubles.");
    }
}
