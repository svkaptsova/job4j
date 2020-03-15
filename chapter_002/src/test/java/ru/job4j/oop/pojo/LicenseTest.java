package ru.job4j.oop.pojo;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class LicenseTest {
    @Test
    public void eqFirstSecond() {
        License first = new License();
        first.setOwner("John");
        first.setModel("Jeep");
        first.setCode("A123AA");
        License second = new License();
        second.setOwner("John");
        second.setModel("Jeep");
        second.setCode("A123AA");
        assertThat(first, is(second));
    }
}