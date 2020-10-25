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
        Comparator<String> compStr = (left, right) -> left.compareTo(right);
        Arrays.sort(strings, compStr);
        System.out.println("Sorted up:");
        for (String str : strings) {
            System.out.println(str);
        }

        Comparator<String> compReverse = (left, right) -> right.length() - left.length();
        Arrays.sort(strings, compReverse);
        System.out.println();
        System.out.println("Sorted down:");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}
