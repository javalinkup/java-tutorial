package org.example.controller;

import org.example.model.User;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {
 @Autowired
 UserService userService;

 @GetMapping
 public String getAllUsers(Model model){
     List<User> users = userService.getAllUsers();
     model.addAttribute("user", users);
     return "userList";

 }

}
