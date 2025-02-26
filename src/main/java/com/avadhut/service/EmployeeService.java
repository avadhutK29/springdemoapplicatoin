package com.avadhut.service;

import com.avadhut.entity.Employee;

import java.util.List;

public interface EmployeeService {

    Employee save(Employee employee);
    List<Employee> findAll();
    Employee findById(Long id);
    Employee update(Employee employee);
    void delete(Long id);

}
