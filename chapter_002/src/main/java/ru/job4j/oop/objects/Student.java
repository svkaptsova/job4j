package ru.job4j.oop.objects;

/**
 * Student Класс для демонстрации навыков студента.
 *
 *  @author Svetlana Kaptsova
 *  @version 1.0
 *  @since 14.02.2020
 */
public class Student {

    public void music() {
        System.out.println("Tra-ta-ta");
    }

    public void song() {
        System.out.println("I believe I can fly");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        petya.music();
        petya.music();
        petya.music();
        petya.song();
        petya.song();
        petya.song();
    }
}
