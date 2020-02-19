package ru.job4j.oop;

/**
 * BallStory Класс для примера взаимодействия объектов.
 * Сказка про колобка.
 *
 * @author Svetlana Kaptsova
 * @version 1.0
 * @since 19.02.2020
 */
public class BallStory {
    public static void main(String[] args) {
        Ball kolobok = new Ball();
        Hare jumper = new Hare();
        Wolf gray = new Wolf();
        Fox sis = new Fox();

        jumper.tryEat(kolobok);
        gray.tryEat(kolobok);
        sis.tryEat(kolobok);
    }
}
