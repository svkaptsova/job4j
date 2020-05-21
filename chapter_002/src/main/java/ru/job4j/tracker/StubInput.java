package ru.job4j.tracker;

import ru.job4j.tracker.Input;

public class StubInput implements Input {
    /**
     * StubInput - симулятор ввода данных пользователем
     *
     * @author Svetlana Kaptsova (svkapcova@gmail.com)
     * @version 1.1
     * @since 1.0
     */
    private String[] answers;
    private int position = 0;

    public StubInput(String[] answers) {
        this.answers = answers;
    }

    @Override
    public String askStr(String question) {
        return answers[position++];
    }

    @Override
    public int askInt(String question) {
        return Integer.valueOf(askStr(question));
    }

    @Override
    public int askInt(String question, int max) {
        return askInt(question);
    }
}
