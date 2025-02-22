package com.avadhut.student.service;

import com.avadhut.student.entity.StudentEntity;

import java.util.List;

public interface StudentService {
    public List<StudentEntity> getAllStudents();
    public StudentEntity getStudentById(Long id);
    public StudentEntity saveStudent(StudentEntity student);
    public StudentEntity updateStudent(StudentEntity student);
    public void deleteStudent(StudentEntity student);}
