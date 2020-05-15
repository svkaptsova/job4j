package ru.job4j.exceptions;

public class FindEl {
    public static int indexOf(String[] arr, String foo) throws ElementNotFoundException {
        int rsl = -1;
        for (int index = 0; index < arr.length; index++) {
            if (arr[index].equals(foo)) {
                rsl = index;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Element not found");
        }
        return rsl;
    }

    public static void main(String[] args) {
        try {
            indexOf(new String[]{"a", "b", "c"}, "b");
        } catch (ElementNotFoundException el) {
            el.printStackTrace();
        }
        try {
            indexOf(new String[]{"a", "b", "c"}, "f");
        } catch (ElementNotFoundException el) {
            el.printStackTrace();
        }
    }
}
