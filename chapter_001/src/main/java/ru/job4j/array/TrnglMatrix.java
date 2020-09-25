package ru.job4j.array;

import java.util.Arrays;

class TrnglMatrix {
    public static int[][] rows(int count) {
        int[][] triangle = new int[count][];
        int a = 1;
        for (int i = 0; i < count - 1; i++) {
            int[] trngl = new int[i + 1];
            for (int j = 0; j < i + 1; j++) {
                trngl[j] = a;
                a++;
            }
            System.out.println(Arrays.toString(trngl));
        }
        return triangle;
    }

    public static void main(String[] args) {
        TrnglMatrix tr = new TrnglMatrix();
        tr.rows(4);
    }
}
