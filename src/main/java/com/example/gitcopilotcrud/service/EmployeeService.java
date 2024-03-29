package com.example.gitcopilotcrud.service;

import com.example.gitcopilotcrud.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmployeeService {
    List<Employee> employees = new ArrayList<>();
    //provide constructor and initialize the list of employees
    public EmployeeService() {
        //create a list of employees
        employees.add(new Employee("John Doe", 30, "IT"));
        employees.add(new Employee("Jane Gibbs", 25, "HR"));
        employees.add(new Employee("Tom Smith", 35, "Finance"));
    }

    //return the list of employees
    public List<Employee> getEmployees() {
        System.out.println("getting Employees");
        return employees;
    }
    //add a new employee to the list
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
    //remove an employee from the list
    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }
    //update an employee in the list
    public void updateEmployee(Employee oldEmployee, Employee newEmployee) {
        int index = employees.indexOf(oldEmployee);
        employees.set(index, newEmployee);
    }
    //get employee by name
    public Employee getEmployeeByName(String name) {
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                return employee;
            }
        }
        return null;
    }

    public List<Employee> getEmployeeByAge(int age) {
        List<Employee> employeesByAge = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getAge() == age) {
                employeesByAge.add(employee);
            }
        }
        return employeesByAge;
    }

}
