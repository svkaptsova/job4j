package ru.job4j.collection;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * OrderConvert - класс для преобразования List в Map
 *
 * @author Svetlana Kaptsova (svkapcova@gmail.com)
 * @version 1.1
 * @since 1.0
 */
public class OrderConvert {
    public static Map<String, Order> process(List<Order> orders) {
        HashMap<String, Order> map = new HashMap<>();
        for (Order order : orders) {
            map.put(order.getNumber(), order);
        }
        return map;
    }
}
