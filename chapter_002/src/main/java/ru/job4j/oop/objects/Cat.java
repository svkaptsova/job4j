package ru.job4j.oop.objects;

/**
 * Cat Пробный класс для работы с полями объектов.
 *
 *  @author Svetlana Kaptsova
 *  @version 1.0
 *  @since 19.02.2020
 */
public class Cat {
    private String food;
    private String name;

    public void show() {
        System.out.println(this.name);
        System.out.println(this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        System.out.println("There are kitten's nick and food:");
        Cat kitten = new Cat();
        kitten.giveNick("Gav");
        kitten.eat("cutlet");
        kitten.show();
        System.out.println("There are blackcat's nick and food:");
        Cat blackcat = new Cat();
        blackcat.giveNick("Black");
        blackcat.eat("fish");
        blackcat.show();
    }
}
