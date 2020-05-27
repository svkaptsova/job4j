package ru.job4j.tracker;

public class ValidateStubInput extends ValidateInput {
    private String[] arr;
    private Integer[] array;
    private int position;

    public ValidateStubInput(String[] arr) {
        this.arr = arr;
    }

    @Override
    public String askStr(String question) {
        return arr[position++];
    }
}
