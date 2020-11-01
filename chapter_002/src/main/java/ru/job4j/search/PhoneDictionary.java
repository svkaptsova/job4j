package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * PhoneDictionary - телефонный справочник
 *
 * @author Svetlana Kaptsova (svkapcova@gmail.com)
 * @version 1.1
 * @since 1.0
 */
public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     *
     * @param key Ключ поиска.
     * @return Список подошедших пользователей.
     */
    public ArrayList<Person> find(String key) {
        Predicate<Person> contName = (str) -> {
            boolean rsl = false;
            for (int index = 0; index < persons.size(); index++) {
                rsl = persons.get(index).getName().contains(key);
            }
            return rsl;
        };

        Predicate<Person> contSurname = (str) -> {
            boolean rsl = false;
            for (int index = 0; index < persons.size(); index++) {
                rsl = persons.get(index).getSurname().contains(key);
            }
            return rsl;
        };

        Predicate<Person> contAdress = (str) -> {
            boolean rsl = false;
            for (int index = 0; index < persons.size(); index++) {
                rsl = persons.get(index).getAddress().contains(key);
            }
            return rsl;
        };

        Predicate<Person> contPhone = (str) -> {
            boolean rsl = false;
            for (int index = 0; index < persons.size(); index++) {
                rsl = persons.get(index).getPhone().contains(key);
            }
            return rsl;
        };

        Predicate<Person> combine = contName.or(contSurname.or(contPhone.or(contAdress)));
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}

