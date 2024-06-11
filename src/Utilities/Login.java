package Utilities;

import Entities.User;
import Repositories.UserRepository;

public class Login {

    public static User login(String username, String password) {
        for (User user : UserRepository.getUsers()) {
            if (user.getPassword().equals(password) && user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

}