package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * PhoneDictionary - телефонный справочник
 *
 * @author Svetlana Kaptsova (svkapcova@gmail.com)
 * @version 1.2
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
        Predicate<Person> contName = (person) -> person.getName() != null && person.getName().contains(key);
        Predicate<Person> contSurname = (person) -> person.getSurname() != null && person.getSurname().contains(key);
        Predicate<Person> contAddress = (person) -> person.getAddress() != null && person.getAddress().contains(key);
        Predicate<Person> contPhone = (person) -> person.getPhone() != null && person.getPhone().contains(key);

        Predicate<Person> combine = contName.or(contSurname.or(contPhone.or(contAddress)));
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}

