package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int result = 0;
        char[] str1 = left.toCharArray();
        char[] str2 = right.toCharArray();
        int size = Math.min(str1.length, str2.length);

        for (int i = 0; i < size; i++) {
            if (str1[i] == '.' || str2[i] == '.') {
                break;
            }
                int rsl = Character.compare(str1[i], str2[i]);
                if (rsl != 0) {
                    result = rsl;
                    break;
                }
            }
        if (result == 0) {
            result = Integer.compare(left.toCharArray().length, right.toCharArray().length);
        }
        return result;
    }

}

