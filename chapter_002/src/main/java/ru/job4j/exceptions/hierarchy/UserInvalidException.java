package ru.job4j.exceptions.hierarchy;

public class UserInvalidException extends UserNotFoundException {
    public UserInvalidException(String message) {
        super(message);
    }
}
