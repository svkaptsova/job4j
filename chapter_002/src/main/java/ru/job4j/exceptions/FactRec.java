package ru.job4j.exceptions;

public class FactRec {
    public static int calc(int n) {
        return (n > 1 ? calc(n - 1) * n : 1);
    }

    public static void main(String[] args) {
        int rsl = calc(3);
        System.out.println(rsl);
    }
}
