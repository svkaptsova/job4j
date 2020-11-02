package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public class StreamUsage {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 0, 3, -5, -1, 7, -10, 8);
        List<Integer> positives = integers.stream().filter(integer -> integer > 0).collect(Collectors.toList());
        positives.forEach(System.out::println);
    }
}
