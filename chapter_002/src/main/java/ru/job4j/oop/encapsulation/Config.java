package ru.job4j.oop.encapsulation;

/**
 * Config Пробный класс для исправления ошибок (модификаторы доступа).
 *
 *  @author Svetlana Kaptsova
 *  @version 1.0
 *  @since 1.0
 */
public class Config {
    private String name;
    private int position;
    private String[] properties;

    public Config(String name) {
        this.name = name;
    }

   public void print() {
        System.out.println(position);
    }

    public String getProperty(String key) {
        return search(key);
    }

    private String search(String key) {
        return key;
    }
}
