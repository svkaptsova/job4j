package ru.job4j.io;

import java.util.Scanner;

/**
 * Matches - Игра "11"
 *
 * @author Svetlana Kaptsova (svkapcova@gmail.com)
 * @version 1.0
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
            if (first > 0 && first <= 3 && first <= match) {
                match = match - first;
                System.out.println(match);
            } else {
                System.out.println("Неверный ход");
            }
            System.out.print("Игрок №2: ");
            int second = Integer.valueOf(input.nextLine());
            if (second > 0 && second <= 3 && second <= match) {
                match = match - second;
                System.out.println(match);
            } else {
                System.out.println("Неверный ход");
            }
        }
        System.out.println("Игра закончена");
    }
}
