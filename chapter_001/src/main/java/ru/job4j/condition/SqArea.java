package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2*(k+1));
        double L = k*h;
        double s = L * h;
        return s;
    }

    public static void main(String[] args) {
        double result1 = square(4, 1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
    }
}

