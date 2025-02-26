package com.avadhut.serviceImpl;

import com.avadhut.entity.Employee;
import com.avadhut.repository.EmployeeRepository;
import com.avadhut.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    /**
     * @param employee
     * @return Employee
     */
    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    /**
     * @return List<Employee>
     */
    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    /**
     * @param id
     * @return Employee
     */
    @Override
    public Employee findById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    /**
     * @param employee
     * @return Employee
     */
    @Override
    public Employee update(Employee employee) {
        return employeeRepository.save(employee);
    }

    /**
     * @param id
     */
    @Override
    public void delete(Long id) {
        employeeRepository.deleteById(id);
    }
}
