package ru.job4j.search;

import org.junit.Test;
import java.util.ArrayList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class PhoneDictionaryTest {
    @Test
    public void whenPutNameThenGetPhone() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Svetlana", "Kaptsova", "1313", "RegionOfMoscow"));
        ArrayList<Person> persons = phones.find("Svetlana");
        assertThat(persons.get(0).getPhone(), is("1313"));
    }

    @Test
    public void whenPutPhoneThenGetSurname() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Svetlana", "Kaptsova", "1313", "RegionOfMoscow"));
        ArrayList<Person> persons = phones.find("1313");
        assertThat(persons.get(0).getSurname(), is("Kaptsova"));
    }

    @Test
    public void whenPutPartOfPhoneThenGetSurnames() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Svetlana", "Kaptsova", "1313", "RegionOfMoscow"));
        phones.add(new Person("Ilya", "Kosolapov", "2312", "Moscow"));
        ArrayList<Person> persons = phones.find("31");
        assertThat(persons.get(0).getSurname(), is("Kaptsova"));
        assertThat(persons.get(1).getSurname(), is("Kosolapov"));
    }
}
