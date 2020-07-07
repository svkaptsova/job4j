package ru.job4j.search;

import java.util.ArrayList;

/**
 * PhoneDictionary - телефонный справочник
 *
 * @author Svetlana Kaptsova (svkapcova@gmail.com)
 * @version 1.0
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
        ArrayList<Person> result = new ArrayList<>();
        for (int index = 0; index < persons.size(); index++) {
            if (persons.get(index).getName().contains(key) || persons.get(index).getSurname().contains(key) || persons.get(index).getAddress().contains(key) || persons.get(index).getPhone().contains(key)) {
                result.add(persons.get(index));
            }
        }
        return result;
    }
}

