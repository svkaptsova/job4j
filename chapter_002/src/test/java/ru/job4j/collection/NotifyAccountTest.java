package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class NotifyAccountTest {

    @Test
    public void whenPutDifferentThenGetBoth() {
        List<Account> accounts = Arrays.asList(
                new Account("1234 567810", "Svetlana Kaptsova", "eDer3432f"),
                new Account("1234 781011", "Svetlana Kaptsova", "000001")
        );
        HashSet<Account> expect = new HashSet<>(
                Arrays.asList(
                        new Account("1234 567810", "Svetlana Kaptsova", "eDer3432f"),
                        new Account("1234 781011", "Svetlana Kaptsova", "000001")
                )
        );
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }

    @Test
    public void whenPutTheSameThenGetOnlyOne() {
        List<Account> accounts = Arrays.asList(
                new Account("1234 567810", "Svetlana Kaptsova", "eDer3432f"),
                new Account("1234 567810", "Svetlana Kaptsova", "eDer3432f"),
                new Account("1234 781011", "Svetlana Kaptsova", "000001")
        );
        HashSet<Account> expect = new HashSet<>(
                Arrays.asList(
                        new Account("1234 567810", "Svetlana Kaptsova", "eDer3432f"),
                        new Account("1234 781011", "Svetlana Kaptsova", "000001")
                )
        );
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }
}