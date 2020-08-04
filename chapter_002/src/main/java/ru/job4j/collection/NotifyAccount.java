package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;

/**
 * NotifyAccount - класс для получения списка уникальных клиентов
 *
 * @author Svetlana Kaptsova (svkapcova@gmail.com)
 * @version 1.0
 * @since 1.0
 */
public class NotifyAccount {
    public static HashSet<Account> sent(List<Account> accounts) {
        HashSet<Account> rsl = new HashSet<>();
        rsl.addAll(accounts);
        return rsl;
    }
}