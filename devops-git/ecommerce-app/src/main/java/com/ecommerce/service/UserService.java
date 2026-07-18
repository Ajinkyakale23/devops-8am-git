package com.ecommerce.service;

import com.ecommerce.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    private static final List<User> users = new ArrayList<>();

    public void registerUser(User user) {
        users.add(user);
    }

    public User login(String email, String password) {

        for (User user : users) {
            if (user.getEmail().equals(email)
                    && user.getPassword().equals(password)) {

                return user;
            }
        }

        return null;
    }

    public List<User> getAllUsers() {
        return users;
    }
}