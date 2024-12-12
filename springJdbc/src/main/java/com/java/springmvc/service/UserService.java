package com.java.springmvc.service;


import com.java.springmvc.model.Employee;
import com.java.springmvc.repository.EmployeeDao;
import com.java.springmvc.repository.UserRepository;
import com.java.springmvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private EmployeeDao userDao;
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


   /* public int createUser(User user) {
        return userDao.saveUser(user);
    }*/
    public int createUser2(Employee employee) {
        return userDao.saveEmployee(employee);
    }
    public User updateUser(Long id, User updatedUser) {
          User user = getUserById(id);
        user.setName(updatedUser.getName());
       user.setEmail(updatedUser.getEmail());
        return userRepository.save(user);
    }
    public Employee getEmployeeById(Long id){
        return userDao.getAllEMpsById(id);
    }
    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found with id: " + id));
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public List<Employee> getAllEmps() {
        return userDao.getAllEMps();
    }
}
