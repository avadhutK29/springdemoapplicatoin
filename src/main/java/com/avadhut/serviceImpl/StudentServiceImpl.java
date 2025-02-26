package com.avadhut.serviceImpl;

import com.avadhut.entity.Student;
import com.avadhut.repository.StudentRepository;
import com.avadhut.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentJpaRepository;

    /**
     * @return Student
     */
    @Override
    public List<Student> getAllStudents() {
        return studentJpaRepository.findAll();
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Student getStudentById(Long id) {
        return studentJpaRepository.findById(id).get();
    }

    /**
     * @param student
     * @return
     */
    @Override
    public Student saveStudent(Student student) {
        return studentJpaRepository.save(student);
    }

    /**
     * @param student
     * @return
     */
    @Override
    public Student updateStudent(Student student) {
        return studentJpaRepository.save(student);
    }

    /**
     * @param student
     */
    @Override
    public void deleteStudent(Student student) {
        studentJpaRepository.delete(student);
    }
}
