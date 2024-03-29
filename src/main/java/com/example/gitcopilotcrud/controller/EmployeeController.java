package com.example.gitcopilotcrud.controller;

import com.example.gitcopilotcrud.model.Employee;
import com.example.gitcopilotcrud.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employees")

public class EmployeeController {

    private final EmployeeService employeeService;
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
//create method for welcome message

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to the Employee Management System";
    }

    //create requestmapping to get all employees
    @GetMapping("/getAllEmployees")
    public List<Employee> getEmployees() {
        System.out.println("getting Employees");
        return employeeService.getEmployees();
    }

    //get employee by name
    @RequestMapping("/{name}")
    public Employee getEmployeeByName(@PathVariable String name) {
        return employeeService.getEmployeeByName(name);
    }

    //get employee by age
    @RequestMapping("/age/{age}")
    public List<Employee> getEmployeeByAge(@PathVariable int age) {
        return employeeService.getEmployeeByAge(age);
    }

}
