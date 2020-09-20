package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int resalt = 0;
        if (o1.toCharArray().length < o2.toCharArray().length) {
            for (int i = 0; i <= o1.toCharArray().length; i++) {
                int rsl = Character.compare(o1.toCharArray()[i], o2.toCharArray()[i]);
                if (rsl != 0) {
                    resalt = rsl;
                    break;
                }
            }
        }
        if (o2.toCharArray().length < o1.toCharArray().length) {
            for (int i = 0; i <= o2.toCharArray().length; i++) {
                int rsl = Character.compare(o1.toCharArray()[i], o2.toCharArray()[i]);
                if (rsl != 0) {
                    resalt = rsl;
                    break;
                }
            }
        }
        return resalt;
    }
}
