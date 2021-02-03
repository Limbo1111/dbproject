package com.mydatabase.dbproject.repository;

import com.mydatabase.dbproject.domain.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

}
