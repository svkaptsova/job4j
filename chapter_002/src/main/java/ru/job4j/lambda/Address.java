package ru.job4j.lambda;

import ru.job4j.stream.Student;

import java.util.Objects;

public class Address {
    private String city;
    private String street;
    private int home;
    private int apartment;

    Address(String city, String street, int home, int apartment) {
        this.city = city;
        this.street = street;
        this.home = home;
        this.apartment = apartment;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getHome() {
        return home;
    }

    public int getApartment() {
        return apartment;
    }

    @Override
    public String toString() {
        return "city:" + city + ", "
                + "street:" + street + ", "
                + "home:" + home + ", "
                + "apartment:" + apartment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Address address = (Address) o;
        return apartment == address.apartment
                && home == address.home
                && Objects.equals(street, address.street)
                && Objects.equals(city, address.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, street, home, apartment);
    }
}

