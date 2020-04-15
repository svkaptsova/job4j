package ru.job4j.oop.casting;

public class StubInput implements Input {
    /**
     * Input - класс для примера использования интерфейса
     *
     * @author Svetlana Kaptsova (svkapcova@gmail.com)
     * @version 1.0
     * @since 1.0
     */
    @Override
    public String askStr(String question) {
        return null;
    }

    @Override
    public int askInt(String question) {
        return 0;
    }
}
