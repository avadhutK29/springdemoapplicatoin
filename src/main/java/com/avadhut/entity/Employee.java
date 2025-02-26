package com.avadhut.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(generator = "emp_id_seq", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "emp_id_seq", initialValue = 100, allocationSize = 1)
    private long id;

    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private String department;
    private String title;
    private String jobTitle;
    private String jobDescription;
    private String salary;
    private String projectName;


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", department='" + department + '\'' +
                ", title='" + title + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", jobDescription='" + jobDescription + '\'' +
                ", salary='" + salary + '\'' +
                ", projectName='" + projectName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(email, employee.email) && Objects.equals(phone, employee.phone) && Objects.equals(address, employee.address) && Objects.equals(department, employee.department) && Objects.equals(title, employee.title) && Objects.equals(jobTitle, employee.jobTitle) && Objects.equals(jobDescription, employee.jobDescription) && Objects.equals(salary, employee.salary) && Objects.equals(projectName, employee.projectName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, email, phone, address, department, title, jobTitle, jobDescription, salary, projectName);
    }
}
