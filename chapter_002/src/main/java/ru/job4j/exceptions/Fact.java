package ru.job4j.exceptions;

public class Fact {

    public int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n can't be less then 0");
        }
        int rsl = 1;
        for (int index = 1; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println("8! = " + new Fact().calc(8));
        System.out.println("-1! = " + new Fact().calc(-1));
    }
}
