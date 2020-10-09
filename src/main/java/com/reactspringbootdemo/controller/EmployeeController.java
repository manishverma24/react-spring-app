package com.reactspringbootdemo.controller;

import com.reactspringbootdemo.modal.Employee;
import com.reactspringbootdemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @author manish on 09/10/20
 */
@RestController
public class EmployeeController {

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping("/employee")
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    @PostMapping("/employee")
    public Employee save(@RequestBody Employee employee) {
        employeeRepository.save(employee);
        return employee;
    }

    @GetMapping("/employee/{id}")
    public Employee employeeById(@PathVariable int id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        return employee.get();
    }

    @DeleteMapping("/employee/{id}")
    public String deleteEmployee(@PathVariable int id) {
        employeeRepository.deleteById(id);
        return "Employee removed with id "+id;
    }

    @PutMapping("/employee")
    public Employee updateEmployee(@RequestBody Employee employee) {
        employeeRepository.save(employee);
        return employee;
    }

}
