package ru.job4j.lambda;

import ru.job4j.tracker.StubInput;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Fi {
    public static void main(String[] args) {
        List<Student> std = Arrays.asList(
                new Student(new Mark("mark 1"), "First", 15),
                new Student(new Mark("mark 2"), "Second", 20),
                new Student(new Mark("mark 3"), "Third", 30)
                );
                Comparator <Student> comparator = new Comparator<Student>() {
                    @Override
                    public int compare(Student st1, Student st2) {
                        return st2.getAge() - st1.getAge();
                    }
                };
        std.sort(comparator);
    }
    Function<Student, Mark> func = new Function<Student, Mark>() {
        @Override
       public Mark apply(Student s) {
            return new Mark(s.getName());
        }
    };
    public static void raw(List<Student> list, Function<Student, Mark> func) {
        for (Student st : list) {
            func.apply(st);
        }
    }
}

