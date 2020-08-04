package ru.job4j.collection;

import java.util.HashMap;

/**
 * UsageMap - пример коллекции HashMap
 *
 * @author Svetlana Kaptsova (svkapcova@gmail.com)
 * @version 1.0
 * @since 1.0
 */
public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("svkapcova@gmail.com", "Svetlana Kaptsova");
        map.put("svkapcova@gmail.com", "Svetlana");
        map.put("d_dexter@yandex.ru", "Ilya Kosolapov");
        map.put("vas-vas@mail.com", "Vasya");

        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
