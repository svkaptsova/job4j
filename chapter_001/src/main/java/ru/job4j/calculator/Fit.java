package ru.job4j.calculator;

public class Fit {
    public static double manWeight(double height) {
        return (height - 100) * 1.15;
    }


    public static double womanWeight(double height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        double man = manWeight(110);
        System.out.println("Man 110 is " + man);
        double woman = womanWeight(120);
        System.out.println("Man 120 is " + woman);
    }
}
