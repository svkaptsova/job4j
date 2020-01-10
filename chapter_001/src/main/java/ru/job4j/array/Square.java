package ru.job4j.array;

public class Square {
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int element = 1; element <= bound; element++) {
            rst[element - 1] = element * element;
        }
        return rst;
    }
}
