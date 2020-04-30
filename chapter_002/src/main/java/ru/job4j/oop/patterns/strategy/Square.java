package ru.job4j.oop.patterns.strategy;

import java.util.StringJoiner;

public class Square implements Shape {
    @Override
    public String draw() {
        StringJoiner picture = new StringJoiner(System.lineSeparator());
        picture.add(".  .  .  .");
        picture.add(".        .");
        picture.add(".        .");
        picture.add(".  .  .  .");
        return picture.toString();
    }
}
