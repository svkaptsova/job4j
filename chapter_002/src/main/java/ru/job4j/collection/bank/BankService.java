package ru.job4j.collection.bank;

import java.util.*;

/**
 * BankService - класс для проведения операций с банковскими счетами
 *
 * @author Svetlana Kaptsova (svkapcova@gmail.com)
 * @version 1.0
 * @since 1.0
 */
public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет нового пользователя в коллекцию, если такого еще нет
     *
     * @param user - новый пользователь
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Метод добавляет новый счет пользователю
     *
     * @param passport - номер паспорта
     * @param account  - новый счет
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null || !users.containsValue(account.getRequisite())) {
            users.get(user).add(account);
        }
    }

    /**
     * Метод для поиска пользователя по номеру паспорта
     *
     * @param passport - номер паспорта
     */
    public User findByPassport(String passport) {
        User result = null;
        for (User user : users.keySet()) {
            if (passport.equals(user.getPassport())) {
                result = user;
                break;
            }
        }
        return result;
    }

    /**
     * Метод для поиска пользователя по реквизитам
     *
     * @param passport  - номер паспорта
     * @param requisite - реквизиты
     */
    public Account findByRequisite(String passport, String requisite) {
        Account account = null;
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> req = users.get(user);
            for (Account accounts : req) {
                if (requisite.equals(accounts.getRequisite())) {
                    account = accounts;
                    break;
                }
            }
        }
        return account;
    }

    /**
     * Метод для перевода денег между счетами
     *
     * @param srcPassport  - номер паспорта пользователя счета списания
     * @param srcRequisite - реквизиты пользователя счета списания
     * @param dPassport    - номер паспорта пользователя счета зачисления
     * @param dRequisite   - реквизиты пользователя счета зачисления
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String dPassport, String dRequisite, double amount) {
        boolean rsl = false;
        Account src = findByRequisite(srcPassport, srcRequisite);
        Account d = findByRequisite(dPassport, dRequisite);
        if (src != null || src.getBalance() >= amount) {
            src.setBalance(src.getBalance() - amount);
            d.setBalance(d.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}
