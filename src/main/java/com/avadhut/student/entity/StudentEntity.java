package com.avadhut.student.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Entity
@Table(name = "student")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long rollNumber;
    private String name;
    private String className;
    private int grade;
    private Long favoriteSubject;
    private Long address;

    @Override
    public String toString() {
        return "StudentEntity{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", className='" + className + '\'' +
                ", grade=" + grade +
                ", favoriteSubject=" + favoriteSubject +
                ", address=" + address +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        StudentEntity that = (StudentEntity) o;
        return grade == that.grade && Objects.equals(rollNumber, that.rollNumber) && Objects.equals(name, that.name) && Objects.equals(className, that.className) && Objects.equals(favoriteSubject, that.favoriteSubject) && Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNumber, name, className, grade, favoriteSubject, address);
    }
}
