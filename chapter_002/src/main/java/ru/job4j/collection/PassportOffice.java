package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * PassportOffice - класс для добавления заявителя в базу
 *
 * @author Svetlana Kaptsova (svkapcova@gmail.com)
 * @version 1.0
 * @since 1.0
 */
public class PassportOffice {
    private Map<String, Citizen> citizens = new HashMap<>();

    /**
     * Метод добавляет заявителя в коллекцию, если заявителя
     * с такими паспортными данными еще не существует
     *
     * @param citizen - заявитель
     */
    public boolean add(Citizen citizen) {
        boolean rsl = false;
        if (!citizens.containsKey(citizen.getPassport())) {
            citizens.put(citizen.getPassport(), citizen);
            rsl = true;
        }
        return rsl;
    }

    /**
     * Метод для поиска заявителя по паспорту
     *
     * @param passport - паспортные данные
     */
    public Citizen get(String passport) {
        return citizens.get(passport);
    }
}
