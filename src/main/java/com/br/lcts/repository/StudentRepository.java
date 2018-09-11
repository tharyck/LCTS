package com.br.lcts.repository;

import com.br.lcts.model.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student,Long> {
    List<Student> findAll();
    Student findOneByUsername(String username);
}

