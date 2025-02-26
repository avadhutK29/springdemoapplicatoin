package com.avadhut.service;

import com.avadhut.entity.Student;

import java.util.List;

public interface StudentService {
    public List<Student> getAllStudents();
    public Student getStudentById(Long id);
    public Student saveStudent(Student student);
    public Student updateStudent(Student student);
    public void deleteStudent(Student student);}
