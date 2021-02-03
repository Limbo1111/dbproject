package com.mydatabase.dbproject.service;

import com.mydatabase.dbproject.domain.Student;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface StudentService {

    void deleteAll();

    void deleteById(Long id);

    Optional<Student> findById(Long id);

    Iterable<Student>findAll();

    void save(Student student);

    void update(Long id, Student student);

    void delete(Student student);
}
