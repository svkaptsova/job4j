package ru.job4j.collection.bank;

import java.util.*;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null || !users.containsValue(account.getRequisite())) {
            users.get(user).add(account);
        }
    }

    public User findByPassport(String passport) {
        User result = null;
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                result = user;
                break;
            }
        }
        return result;
    }

    public Account findByRequisite(String passport, String requisite) {
        Account account = null;
        User user = findByPassport(passport);
        List<Account> req = users.get(user);
        for (Account accounts : req) {
            if (user != null || accounts.getRequisite().equals(requisite)) {
                account = accounts;
                break;
            }
        }
        return account;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String dPassport, String dRequisite, double amount) {
        boolean rsl = false;
        Account src = findByRequisite(srcPassport, srcRequisite);
        Account d = findByRequisite(dPassport, dRequisite);
        if (src != null || src.getBalance() >= amount) {
            d.setBalance(d.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}
