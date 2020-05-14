package ru.job4j.exceptions;

public class FindEl {
    public static int indexOf(String[] arr, String foo) throws ElementNotFoundException {
        if (rsl == -1) {
            throw new ElementNotFoundException("Url could not be null");
        }
        int rsl = -1;
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == foo) {
                rsl = index;
                break;
            }
            return rsl;
        }
    }

    public static void main(String[] args) {
        try {
            indexOf(new String[]{"a", "b", "c"}, "b");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
