package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

/**
 * Tracker - Класс для создания и хранения заявок.
 *
 * @author Svetlana Kaptsova (svkapcova@gmail.com)
 * @version 1.3
 * @since 1.0
 */
public class Tracker {
    /**
     * Массив для хранения заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод добавления заявки в хранилище
     *
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(generateId());
        items[position++] = item;
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     *
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    public Item[] findAll() {
        Item[] result = new Item[items.length];
        int size = 0;
        for (int i = 0; i < items.length; i++) {
            Item name = items[i];
            if (name != null) {
                result[size] = name;
                size++;
            }
        }
        result = Arrays.copyOf(result, size);
        return result;
    }

    Item[] findByName(Item item) {
        Item[] temp = findAll();
        Item[] result = new Item[temp.length];
        int size = 0;
        for (int i = 0; i < temp.length; i++) {
            Item name = temp[i];
            if (name.getName().equals(item.getName())) {
                result[size] = name;
                size++;
            }
        }
        result = Arrays.copyOf(result, size);
        return result;
    }

    Item findById(Item item) {
        Item[] temp = findAll();
        Item result = null;
        for (int i = 0; i < temp.length; i++) {
            Item id = temp[i];
            if (id.getId().equals(item.getId())) {
                result = id;
                break;
            }
        }
        return result;
    }
}
