package com.mydatabase.dbproject.domain;

import javax.persistence.*;
import java.util.Scanner;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column
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
