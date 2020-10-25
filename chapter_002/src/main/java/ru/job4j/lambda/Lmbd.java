package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class Lmbd {
    public static void main(String[] args) {
        String[] strings = {
                new String("First"),
                new String("Seventh"),
                new String("Second")
        };
        Comparator<String> compStr = (left, right) -> {
            System.out.println("Sorted up:");
            return left.compareTo(right);
        };
        Arrays.sort(strings, compStr);
        for (String str : strings) {
            System.out.println(str);
        }

        Comparator<String> compReverse = (left, right) -> {
            System.out.println();
            System.out.println("Sorted down:");
            return right.length() - left.length();
        };

        Arrays.sort(strings, compReverse);
        for (String str : strings) {
            System.out.println(str);
        }
    }
}
