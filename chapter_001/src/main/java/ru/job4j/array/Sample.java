package ru.job4j.array;

public class Sample {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int index = 0; index != 5; index++) {
            numbers[index] = numbers.length - index;
            System.out.println(numbers[index]);
        }
    }
}
