package ru.job4j.oop.objects;

/**
 * Jukebox - тестовый класс
 *
 *  @author Svetlana Kaptsova
 *  @version 1.0
 *  @since 14.02.2020
 */
public class Jukebox {

    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if (position == 2) {
            System.out.println("Спокойной ночи");
        } else {
            System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        Jukebox samsung = new Jukebox();
        int track = 2;
        samsung.music(track);
    }
}
