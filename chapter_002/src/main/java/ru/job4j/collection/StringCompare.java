package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int result = 0;
        int size = Math.min (o1.toCharArray().length, o2.toCharArray().length);

            for (int i = 0; i <size; i++) {
                int rsl = Character.compare(o1.toCharArray()[i], o2.toCharArray()[i]);
                if (rsl != 0) {
                    result = rsl;
                    break;
                }
            }
            if  (result == 0) {
                result = Integer.compare(o1.toCharArray().length, o2.toCharArray().length);
            }
        return result;
    }
}
