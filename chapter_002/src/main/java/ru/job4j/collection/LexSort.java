package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String[] numbers1 = left.split(" ")[0].split("\\.");
        String[] numbers2 = right.split(" ")[0].split("\\.");
        int result = 0;
        int size = Math.min(numbers1.length, numbers2.length);
        for (int i = 0; i < size; i++) {
            if (numbers1.length == numbers2.length) {
                int rsl = Integer.compare(Integer.valueOf(numbers1[i]), Integer.valueOf(numbers2[i]));
                if (rsl != 0) {
                    result = rsl;
                    break;
                }
            }
        }
        if (result == 0) {
            result = Integer.compare(numbers1.length, numbers2.length);
        }
        return result;
    }
}

