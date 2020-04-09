package ru.job4j.poly;

/**
 * Bus - класс для примера использования интерфейсов
 *
 * @author Svetlana Kaptsova (svkapcova@gmail.com)
 * @version 1.0
 * @since 1.0
 */
public class Bus implements Transport {
    @Override
    public void ride() {

    }

    @Override
    public void passengers(int quantity) {

    }

    @Override
    public int fill(int liters) {
        return 0;
    }
}
