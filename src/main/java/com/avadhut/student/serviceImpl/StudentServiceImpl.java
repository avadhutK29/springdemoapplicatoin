package com.avadhut.student.serviceImpl;

import com.avadhut.student.entity.StudentEntity;
import com.avadhut.student.repository.StudentRepository;
import com.avadhut.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentJpaRepository;

    /**
     * @return StudentEntity
     */
    @Override
    public List<StudentEntity> getAllStudents() {
        return studentJpaRepository.findAll();
    }

    /**
     * @param id
     * @return
     */
    @Override
    public StudentEntity getStudentById(Long id) {
        return null;
    }

    /**
     * @param student
     * @return
     */
    @Override
    public StudentEntity saveStudent(StudentEntity student) {
        return null;
    }

    /**
     * @param student
     * @return
     */
    @Override
    public StudentEntity updateStudent(StudentEntity student) {
        return null;
    }

    /**
     * @param student
     */
    @Override
    public void deleteStudent(StudentEntity student) {

    }
}
