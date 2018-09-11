package com.br.lcts.service;

import com.br.lcts.model.Student;
import com.br.lcts.repository.StudentRepository;
import com.br.lcts.util.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements CrudService<Student> {
    private StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student create(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student getById(Long id) {
        return studentRepository.findOne(id);
    }

    public Student getByUsername(String username){
        return studentRepository.findOneByUsername(username);
    }

    @Override
    public Student update(Student student) {
        return studentRepository.exists(student.getId()) ? studentRepository.save(student) : null;
    }

    @Override
    public void removeById(Long id) {
        if (studentRepository.exists(id)) {
            studentRepository.delete(getById(id));
        }
    }

    @Override
    public void removeAll() {
        studentRepository.deleteAll();
    }
}

