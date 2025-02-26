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
public class Student {


    @Id
    @GeneratedValue(generator = "student_roll_num_seq", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "student_roll_num_seq", initialValue = 100, allocationSize = 1)
    private Long rollNumber;
    private String name;
    private String className;
    private String grade;
    private String favoriteSubject;
    private String address;

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", className='" + className + '\'' +
                ", grade='" + grade + '\'' +
                ", favoriteSubject='" + favoriteSubject + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(rollNumber, student.rollNumber) && Objects.equals(name, student.name) && Objects.equals(className, student.className) && Objects.equals(grade, student.grade) && Objects.equals(favoriteSubject, student.favoriteSubject) && Objects.equals(address, student.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNumber, name, className, grade, favoriteSubject, address);
    }
}
