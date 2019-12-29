package ru.job4j.condition;

public class TrgArea {
    public static double area(float a, float b, float c) {
        float p = ((a+b+c)/2);
        return Math.sqrt (p*(p-a)*(p-b)*(p-c));
    }

    public static void main(String[] args) {
        float rsl = (float) TrgArea.area(2, 2, 2);
        System.out.printf("area(2, 2, 2) = %.2f", rsl);
    }
}
