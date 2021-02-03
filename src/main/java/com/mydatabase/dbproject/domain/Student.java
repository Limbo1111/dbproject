package com.mydatabase.dbproject.domain;

import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Scanner;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    @NotEmpty(message = "Name should not be empty")
    @Size(min = 2, max = 30, message = "Not a valid name")
    private String name;

    @Column
    @NotEmpty(message = "Faculty should not be empty")
    @Size(min = 2, max = 30, message = "Not a valid faculty")
    private String faculty;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public Student() {

    }

    public Student(String name, String faculty) {
        this.name = name;
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return String.format("Id: %d, Name: '%s', Faculty: '%s'.", id, name, faculty);
    }

}
