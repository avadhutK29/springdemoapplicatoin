package com.avadhut.controller;

import com.avadhut.entity.Employee;
import com.avadhut.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    private final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    @PostMapping("saveEmployee")
    public Employee saveEmployee(@RequestBody Employee employee) {
        return employeeService.save(employee);
    }

    @GetMapping("getEmployee/{id}")
    public Employee getEmployeeById(@PathVariable(name = "id") Long id) {
        return employeeService.findById(id);
    }

    @PostMapping("updateEmployee")
    public Employee updateEmployee(Employee employee) {
        return employeeService.update(employee);
    }

    @DeleteMapping("deleteEmployee")
    public void deleteEmployee(Long id) {
        employeeService.delete(id);
    }

    @GetMapping("fetchAllEmployee")
    public List<Employee> getAllEmployees() {
        return employeeService.findAll();
    }
}
