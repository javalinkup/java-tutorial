package org.example.service;

import org.example.model.User;

import java.util.Arrays;
import java.util.List;

public class UserService {
    public List<User> getAllUsers() {
        User user = new User();
        user.setId(123L);
        user.setName("Raj Kumar");
        user.setEmail("RajKumar@gmail.com");
        List<User> userList = Arrays.asList(user);
        return userList;
    }
}
