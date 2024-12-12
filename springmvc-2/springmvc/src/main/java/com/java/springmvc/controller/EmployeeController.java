package com.java.springmvc.controller;

import com.java.springmvc.model.Employee;
import com.java.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    UserService service;
    @PostMapping("/saveEmployee")
    public String saveEmployee(@RequestBody Employee employee){
        service.createUser2(employee);
        return "Employee Saved successfully";
    }

    @GetMapping("/getAllEmps")
    public List<Employee> getAllEmployees(){
       return service.getAllEmps();

    }
    @GetMapping("/getEmp/{id}")
    public Employee getAllEmployeeById(@PathVariable Long id){
        return service.getEmployeeById(id);

    }
}
