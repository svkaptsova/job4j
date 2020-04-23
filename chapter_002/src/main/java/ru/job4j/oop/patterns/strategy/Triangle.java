package ru.job4j.oop.patterns.strategy;

import ru.job4j.oop.patterns.strategy.Shape;

public class Triangle implements Shape {
    @Override
    public String draw() {
        String trngl = "Triangle";
        return trngl;
    }
}
