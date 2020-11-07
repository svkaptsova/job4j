package ru.job4j.stream;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class SchoolTest {
    private List<Student> students = new ArrayList<>();

    @Before
    public void setUp() {
        students.add(new Student(10, "Surname1"));
        students.add(new Student(20, "Surname2"));
        students.add(new Student(30, "Surname3"));
        students.add(new Student(40, "Surname4"));
        students.add(new Student(50, "Surname5"));
        students.add(new Student(70, "Surname6"));
        students.add(new Student(80, "Surname7"));
        students.add(new Student(100, "Surname8"));
    }

    @Test
    public void whenCollectSubclassA() {
        School sc = new School();
        List<Student> rsl = sc.collect(
                students, (student) -> student.getScore() >= 70
        );
        List<Student> expected = new ArrayList<>();
        expected.add(new Student(70, "Surname6"));
        expected.add(new Student(80, "Surname7"));
        expected.add(new Student(100, "Surname8"));
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenCollectSubcassB() {
        School sc = new School();
        List<Student> rsl = sc.collect(
                students, (student) -> student.getScore() < 70 && student.getScore() >= 50
        );
        List<Student> expected = new ArrayList<>();
        expected.add(new Student(50, "Surname5"));
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenCollectSubclassC() {
        School sc = new School();

        List<Student> rsl = sc.collect(
                students, (student) -> student.getScore() < 50
        );
        List<Student> expected = new ArrayList<>();
        expected.add(new Student(10, "Surname1"));
        expected.add(new Student(20, "Surname2"));
        expected.add(new Student(30, "Surname3"));
        expected.add(new Student(40, "Surname4"));
        assertThat(rsl, is(expected));
    }
}