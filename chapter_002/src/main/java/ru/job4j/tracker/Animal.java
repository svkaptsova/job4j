package ru.job4j.tracker;

public class Animal {
    private String name;

    public Animal(String nickname) {
        this.name = nickname;
    }

    public static void main(String[] args) {
        Animal animal = new Animal("Tiga");
    }
}
