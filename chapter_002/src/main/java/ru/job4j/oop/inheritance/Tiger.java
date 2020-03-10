package ru.job4j.oop.inheritance;

public class Tiger extends Predator {
    public Tiger(String anim, String otryad, String spec) {
        super(anim, otryad, spec);
    }

    public static void main(String[] args) {
        Tiger tiger = new Tiger("Animal", "Predator", "Tiger");
    }
}
