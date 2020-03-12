package ru.job4j.oop.inheritance.animals;

public class Predator extends Animal {
    private String species;

    public Predator(String anim, String otryad) {
        super(anim, otryad);
    }

    public Predator(String anim, String otryad, String spec) {
        super(anim, otryad);
        this.species = spec;
        System.out.println(spec);
    }

    public static void main(String[] args) {
        Predator predator = new Predator("Animal", "Predator");
    }
}
