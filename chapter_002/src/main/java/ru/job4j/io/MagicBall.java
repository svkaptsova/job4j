package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

/**
 * MagicBall - Класс-предсказатель
 *
 * @author Svetlana Kaptsova (svkapcova@gmail.com)
 * @version 1.0
 * @since 1.0
 */
public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        String question = input.nextLine();
        int select = new Random().nextInt(3);
        String answer = "Может быть";
        if (select == 0) {
            answer = "Да";
        } else if (select == 1) {
            answer = "Нет";
        }
        System.out.println(answer);
    }
}
