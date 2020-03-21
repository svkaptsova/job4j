package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

/**
 * Tracker - Класс для создания и хранения заявок.
 *
 * @author Svetlana Kaptsova (svkapcova@gmail.com)
 * @version 1.0
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
        Item[] notNull = new Item[items.length];
        int size = 0;
        for (int i = 0; i < items.length; i++) {
            Item name = items[i];
            if (name != null) {
                notNull[size] = name;
                size++;
            }
        }
        notNull = Arrays.copyOf(notNull, size);
        return notNull;
    }

    Item[] findByName(String key) {
        Item[] eName = new Item[findAll().length];
        int size = 0;
        for (int i = 0; i < findAll().length; i++) {
            Item name = findAll()[i];
            if (name.getName().equals(key)) {
                eName[size] = name;
                size++;
            }
        }
            eName = Arrays.copyOf(eName, size);
            return eName;
    }

        Item findById (String code){
        Item eId = null;
            for (int i = 0; i < findAll().length; i++) {
                Item id = findAll()[i];
                if (id.getId().equals(code)) {
                    eId = id;
                    break;
                }
            }
            return eId;
        }
}
