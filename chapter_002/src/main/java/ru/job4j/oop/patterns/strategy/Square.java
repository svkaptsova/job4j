package ru.job4j.oop.patterns.strategy;

import ru.job4j.oop.patterns.strategy.Shape;

public class Square implements Shape {
    @Override
    public String draw() {
        String sqr = "Square";
        return sqr;
    }
}
