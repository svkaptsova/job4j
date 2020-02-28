package ru.job4j.oop.overriding;

/**
 * Report - класс для демонстрации работы переопределенного метода.
 *
 * @author Svetlana Kaptsova (svkapcova@gmail.com)
 * @version 1.0
 * @since 1.0
 */
public class Report {
    public static void main(String[] args) {
        TextReport treport = new TextReport();
        JSONReport jreport = new JSONReport();
        String textrep = treport.generate("name", "body");
        System.out.println(textrep);
        String jsonrep = jreport.generate("name", "body");
        System.out.println(jsonrep);
    }
}
