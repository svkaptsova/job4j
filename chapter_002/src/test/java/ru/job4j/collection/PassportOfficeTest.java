package ru.job4j.collection;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class PassportOfficeTest {

    @Test
    public void whenPutNewThenAddAndGet() {
        Citizen citizen = new Citizen("3453", "Svetlana Kaptsova");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get(citizen.getPassport()), is(citizen));
    }
}
