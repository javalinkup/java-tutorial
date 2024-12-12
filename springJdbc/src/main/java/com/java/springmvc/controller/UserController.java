package com.java.springmvc.controller;

import com.java.springmvc.model.User;
import com.java.springmvc.service.UserService;
import org.hibernate.mapping.Array;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



@Controller
@RequestMapping("/users")
public class UserController {
 @Autowired
 private UserService userService;


    @GetMapping("/form")
    public String showUserForm(Model model){
        model.addAttribute("user", new User());
        return "userForm";
    }


  /*  @GetMapping("/form")
    public String getUsers(Model model) {
        List<User> users = userService.getAllUsers();
        model.addAttribute("userInfo", users);
        return "userInfo";
    }*/

    @PostMapping("/form")
    public String saveUserInfo(@ModelAttribute User user,  Model model) {
        //userService.createUser(user);
        model.addAttribute("userInfo", userService.getAllUsers());
        return "userInfo";
    }
    @GetMapping
    public String listUsers(Model model){
        model.addAttribute("userInfo", userService.getAllUsers());
        return "userInfo";
    }

   /* @GetMapping("edit/{id}")
    public String editUser(@PathVariable Long id, Model model){

      model.addAttribute("user", user);
      return "userInfo";

    }*/


    @PutMapping("/update/{id}")
    public User updateuser(@PathVariable Long id, @RequestBody User user){
        User user2 = userService.updateUser(id, user);
        return user2;
    }
    @DeleteMapping("/delete/{id}")
    public String updateuser(@PathVariable Long id){
        userService.deleteUser(id);
        return "Deleted Suuccessfully";
    }
}
