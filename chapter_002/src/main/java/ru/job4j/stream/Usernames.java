package ru.job4j.stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Usernames {
    public static void main(String[] args) {
List<Student> students = Arrays.asList(
        new Student(70, "Ivanov"),
        new Student(80, "Petrov"),
        new Student(100, "Vasechkin"));
        Map usernames = students.stream().collect(Collectors.toMap(
                e-> e.getSurname(),
                e -> e));
        students.forEach(System.out::println);
    }
}
