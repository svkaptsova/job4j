package ru.job4j.exceptions;

public class FactRec {
    public static int calc(int n) {
        int rsl;
        rsl = (n == 0 || n == 1 ? 1 : calc(n - 1) * n);
        return rsl;
    }

    public static void main(String[] args) {
        int rsl = calc(3);
        System.out.println(rsl);
    }
}
