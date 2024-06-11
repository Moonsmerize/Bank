package Repositories;

import java.util.ArrayList;

import Entities.User;

public class UserRepository {

    private static ArrayList<User> users = new ArrayList<>();

    public static ArrayList<User> getUsers() {
        return users;
    }

    public static void setUsers(ArrayList<User> users) {
        UserRepository.users = users;
    }

}
