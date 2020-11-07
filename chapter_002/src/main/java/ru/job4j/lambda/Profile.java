package ru.job4j.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Profile {
    private Address address;

    Profile(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public static void main(String[] args) {
        List<Profile> profiles = Arrays.asList(
                new Profile(new Address("Moscow", "Arbat", 3, 4)),
                new Profile(new Address("Saint-Petersburg", "Sadovaya", 7, 8)),
                new Profile(new Address("Novosibirsk", "Lenina", 13, 17)));
        List<Address> addresses = profiles.stream()
                .map(x -> x.getAddress())
                .collect(Collectors.toList());
        addresses.forEach(System.out::println);
    }
}

