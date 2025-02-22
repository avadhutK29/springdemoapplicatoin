package com.avadhut.student.controller;

import com.avadhut.student.entity.StudentEntity;
import com.avadhut.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {


    @Autowired
    private StudentService studentService;

    @GetMapping("helloSpringBoot")
    public String helloMethod() {
        return "Welcome to the spring boot application!!!";
    }

    @RequestMapping(value="welcome",method = RequestMethod.GET,produces="application/json")
    public String welcome() {
        return "Welcome to the Spring Boot Applicaton";
    }

    /**
     * This is default API to check application status
     * @return String
     */
    @RequestMapping(value="/*",method = RequestMethod.GET,produces="application/json")
    public String start() {
        return "Spring boot application started successfully!!!";
    }


    @GetMapping("getAllStudents")
    public List<StudentEntity> getStudent() {
        return studentService.getAllStudents();
    }

    @GetMapping("fetch/student/{id}")
    public StudentEntity getStudentById(@PathVariable("id") Long id) {
        return studentService.getStudentById(id);
    }
}
