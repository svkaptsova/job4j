package ru.job4j.oop;

/**
 * DummyDic Пробный класс для тренировки вызова метода с возвращаемым типом
 *
 * @author Svetlana Kaptsova
 * @version 1.0
 * @since 14.02.2020
 */
public class DummyDic {
    public String engToRus(String eng) {
        return eng;
    }

    public static void main(String[] args) {
        DummyDic translator = new DummyDic();
        String word = "enough";
        System.out.println("Неизвестное слово: " + translator.engToRus(word));


    }
}
