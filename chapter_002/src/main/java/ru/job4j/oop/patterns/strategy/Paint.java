package ru.job4j.oop.patterns.strategy;

/**
 * Paint - класс для примера использования шаблонов
 *
 * @author Svetlana Kaptsova (svkapcova@gmail.com)
 * @version 1.0
 * @since 1.0
 */
public class Paint {
    public void draw(Shape shape) {
        String foo = shape.draw();
        System.out.println(foo);
    }

    public static void main(String[] args) {
        Paint pnt = new Paint();
        Shape tr = new Triangle();
        Shape sq = new Square();
        pnt.draw(tr);
        pnt.draw(sq);
    }
}
