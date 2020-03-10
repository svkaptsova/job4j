package ru.job4j.oop.objects;

/**
 * Battery Класс для примера взаимодействия объектов.
 * Состояние объекта (заряд батареи).
 *
 * @author Svetlana Kaptsova
 * @version 1.0
 * @since 20.02.2020
 */
public class Battery {
    private int load;

    public Battery(int value) {
        this.load = value;
    }

    public void exchange(Battery another) {
        another.load = this.load + another.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery first = new Battery(8);
        Battery second = new Battery(4);
        System.out.println("first : " + first.load + ". second : " + second.load);
        first.exchange(second);
        System.out.println("first : " + first.load + ". second : " + second.load);
    }
}
