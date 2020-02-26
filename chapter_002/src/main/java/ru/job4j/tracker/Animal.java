package ru.job4j.tracker;

public class Animal {
    private String animal;
    private String ordo;

    public Animal(String anim) {
        this.animal = anim;
        System.out.println(animal);
    }

    public Animal(String anim, String otryad) {
        this.animal = anim;
        this.ordo = otryad;
        System.out.println(animal);
        System.out.println(ordo);
    }

    public static void main(String[] args) {
        Animal animal = new Animal("Tiga");
    }
}
