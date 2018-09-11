package com.br.lcts.service;

import com.br.lcts.model.Teacher;
import com.br.lcts.repository.TeacherRepository;
import com.br.lcts.util.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements CrudService<Teacher> {
    private TeacherRepository teacherRepository;

    @Autowired
    public TeacherServiceImpl(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public Teacher create(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    @Override
    public List<Teacher> getAll() {
        return teacherRepository.findAll();
    }

    @Override
    public Teacher getById(Long id) {
        return teacherRepository.findOne(id);
    }

    public Teacher getByUsername(String username){
        return teacherRepository.findOneByUsername(username);
    }

    @Override
    public Teacher update(Teacher teacher) {
        return teacherRepository.exists(teacher.getId()) ? teacherRepository.save(teacher) : null;
    }

    @Override
    public void removeById(Long id) {
        if (teacherRepository.exists(id)) {
            teacherRepository.delete(getById(id));
        }
    }

    @Override
    public void removeAll() {
        teacherRepository.deleteAll();
    }
}

