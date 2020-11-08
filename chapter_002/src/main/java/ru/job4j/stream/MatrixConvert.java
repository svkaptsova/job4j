package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MatrixConvert {
    public static void main(String[] args) {
        List<List<Integer>> matrix = List.of(
                List.of(1, 2),
                List.of(3, 4),
                List.of(5, 6),
                List.of(7, 8)
        );
        List<Integer> integers = matrix.stream()
                .flatMap(x -> x.stream())
                .collect(Collectors.toList());
        integers.forEach(System.out::println);
    }
}
