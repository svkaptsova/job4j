package ru.job4j.collection;

import java.util.*;

public class Departments {
    public static List<String> fillGaps(List<String> deps) {
        HashSet<String> tmp = new HashSet<>();
        List<String> rsl = new ArrayList<>(tmp);
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                tmp.add(start + "/" + el);
                start = start + "/" + el;
            }
        }
        return rsl;
    }

    public static void sortAsc(List<String> orgs) {
        Comparator.naturalOrder();
    }

    public static void sortDesc(List<String> orgs) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < orgs.size(); i++) {
            String[] str1 = orgs.get(i).split("/");
            String[] str2 = orgs.get(i + 1).split("/");
            int sz = Math.min(str1.length, str2.length);
            if (str1[0].equals(str2[0])) {
                orgs.sort(new DepDescComp());
            } else {
                int rslt = 0;
                for (int j = 1; j < sz; j++) {
                    str2[0].compareTo(str1[0]);
                    String left = str1[j];
                    String right = str2[j];
                    int rsl = left.compareTo(right);
                    if (rsl != 0) {
                        rslt = rsl;
                        break;
                    }
                    if (rsl == 0) {
                        rslt = Integer.compare(str1.length, str2.length);
                    }
                }
            }
        }
    }
}

