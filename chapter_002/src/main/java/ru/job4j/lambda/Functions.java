package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Functions {
    public static List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> doubles = new ArrayList<>();
        double x;
        for (x = start; x <= end; x++) {
            doubles.add(func.apply(x));
        }
        return doubles;
    }

    public static List<Double> multiplication(int start, int end) {
        Function<Double, Double> fu = (a) -> a * a;
        return diapason(start, end, fu);
    }

    public static List<Double> addition(int start, int end) {
        Function<Double, Double> fu = (a) -> 4 * a;
        return diapason(start, end, fu);
    }
}

