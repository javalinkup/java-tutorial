package com.java.springmvc.service;


import com.java.springmvc.repository.UserRepository;
import com.java.springmvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public List<User> getAllUsers() {
       /* User user = new User();
        user.setId(123L);
        user.setName("Raj Kumar");
        user.setEmail("RajKumar@gmail.com");
        User user2 = new User();
        user2.setEmail("Naveen@gmail.com");
        user2.setId(7899L);
        user2.setName("Naveen Sangam");
        user.setId(123L);
        user.setName("Raj Kumar");
        user.setEmail("RajKumar@gmail.com");
        List<User> userList = Arrays.asList(user, user2);*/

        return userRepository.findAll();
    }


    public User createUser(User user) {
        return userRepository.save(user);
    }
}
