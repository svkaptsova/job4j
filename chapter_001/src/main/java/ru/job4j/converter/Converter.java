package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }
    public static int rubleToDollar(int value) {
        return value / 60;
    }
    public static int euroToRuble(int value) {
        return value * 70;
    }
    public static int dollarToRuble(int value) {
        return value * 60;
    }
    public static void main(String[] args) {
        int inRub = 210;
        int expectedEur = 3;
        int out1 = rubleToEuro(inRub);
        boolean passed1 = expectedEur == out1;
        System.out.println("210 rubles are 3 euro. Test result : " + passed1);

        int inRub1 = 240;
        int expectedDol = 4;
        int out2 = rubleToDollar(inRub1);
        boolean passed2 = expectedDol == out2;
        System.out.println("240 rubles are 4 dollars. Test result : " + passed2);

        int inEur = 7;
        int expectedRub = 490;
        int out3 = euroToRuble(inEur);
        boolean passed3 = expectedRub == out3;
        System.out.println("7 euro are 490 rubles. Test result : " + passed3);

        int inDol = 8;
        int expectedRub1 = 480;
        int out4 = dollarToRuble(inDol);
        boolean passed4 = expectedRub1 == out4;
        System.out.println("8 dollars are 480 rubles. Test result : " + passed4);

        int euro = rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        int dollars = rubleToDollar(120);
        System.out.println("120 rubles are " + dollars + " dollars.");
        int rubles = euroToRuble(3);
        System.out.println("3 euro are " + rubles + " rubles.");
        int rublesd = dollarToRuble(4);
        System.out.println("4 dollars are " + rublesd + " rubles.");
    }
}
