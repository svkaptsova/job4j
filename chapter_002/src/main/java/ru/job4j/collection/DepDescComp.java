package ru.job4j.collection;

import java.util.Comparator;

/**
 * DepDescComp - класс для сортировки подразделений по убыванию
 *
 * @author Svetlana Kaptsova (svkapcova@gmail.com)
 * @version 1.0
 * @since 1.0
 */
public class DepDescComp implements Comparator<String> {

    /**
     * Метод сортирует головные подразделения по убыванию,
     * а службы внутри головных подразделений по - по возрастанию
     *
     * @param left  - строка с кодами подразделений
     * @param right - строка с кодами подразделений
     * @return - список подразделений, отсортированный в убывающем порядке
     */
    @Override
    public int compare(String left, String right) {
        int result = 0;
        String[] str1 = left.split("/");
        String[] str2 = right.split("/");
        if (str1[0].equals(str2[0])) {
            result = left.compareTo(right);
        } else {
            result = right.compareTo(left);
        }
        return result;
    }
}
