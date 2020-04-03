package ru.job4j.io;

import java.util.Scanner;

/**
 * Matches - Игра "11"
 *
 * @author Svetlana Kaptsova (svkapcova@gmail.com)
 * @version 1.2
 * @since 1.0
 */
public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int match = 11;
        System.out.println("Игра 11");
        while (match > 0) {
            System.out.print("Игрок №1: ");
            int first = Integer.valueOf(input.nextLine());
            boolean right1 = first > 0 && first <= 3 && first <= match;
            while (!right1) {
                System.out.println("Неверный ход!");
                System.out.print("Игрок №1: ");
                first = Integer.valueOf(input.nextLine());
                right1 = first > 0 && first <= 3 && first <= match;
            }

            match = match - first;
            if (match == 0) {
                System.out.println("Игрок №1 победил");
                System.out.println("Игра окончена");
                break;
            } else {
                System.out.println(match);
            }

            System.out.print("Игрок №2: ");
            int second = Integer.valueOf(input.nextLine());
            boolean right2 = second > 0 && second <= 3 && second <= match;
            while (!right2) {
                System.out.println("Неверный ход!");
                System.out.print("Игрок №2: ");
                second = Integer.valueOf(input.nextLine());
                right2 = second > 0 && second <= 3 && second <= match;
            }

            match = match - second;
            if (match == 0) {
                System.out.println("Игрок №2 победил");
                System.out.println("Игра окончена");
            } else {
                System.out.println(match);
            }
        }
    }
}
