package ru.job4j.exceptions.hierarchy;

import ru.job4j.exceptions.ElementNotFoundException;

/**
 * UserStore - класс-хранилище пользователей
 *
 * @author Svetlana Kaptsova (svkapcova@gmail.com)
 * @version 1.0
 * @since 1.0
 */
public class UserStore {

    /**
     * Поиск пользователя по имени
     *
     * @param users - массив объектов типа User()
     * @param login - имя пользователя
     */
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User user = null;
        for (int index = 0; index < users.length; index++) {
            if (users[index].getUsername().equals(login)) {
                user = users[index];
                break;
            }
        }
        if (user == null) {
            throw new UserNotFoundException("User not found");
        }
        return user;
    }

    /**
     * Проверка пользователя на валидность
     *
     * @param user - объект типа User()
     */
    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() && user.getUsername().length() < 3) {
            throw new UserInvalidException("Invalid User");
        }
        return user.isValid();
    }

    public static void main(String[] args) {
        User[] users = {new User("Barsik", true)};
        try {
            User user = findUser(users, "Barsik");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserNotFoundException unf) {
            unf.printStackTrace();
        } catch (UserInvalidException uivd) {
            uivd.printStackTrace();
        }
    }
}
