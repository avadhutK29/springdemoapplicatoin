package com.avadhut.controller;

import com.avadhut.entity.Student;
import com.avadhut.service.StudentService;
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
    public List<Student> getStudent() {
        return studentService.getAllStudents();
    }

    @GetMapping("fetch/student/{id}")
    public Student getStudentById(@PathVariable("id") Long id) {
        return studentService.getStudentById(id);
    }

    @PostMapping("/saveStudent")
    public Student addStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @PostMapping("updateStudent")
    public Student updateStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);
    }

    @DeleteMapping("deleteStudent")
    public void deleteEmployee(@RequestBody Student student) {
        studentService.deleteStudent(student);
    }


}
