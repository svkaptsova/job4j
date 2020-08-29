package ru.job4j.collection.sort;

/**
 * Item - модель заявки
 *
 * @author Svetlana Kaptsova (svkapcova@gmail.com)
 * @version 1.0
 * @since 1.0
 */
public class Item implements Comparable<Item> {
    private int id;
    private String name;

    public Item(int id, String name) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.id + " " + this.name;
    }

    @Override
    public int compareTo(Item item) {
        return Integer.compare(id, item.id);
    }
}
