package com.br.lcts.util;

import com.br.lcts.model.Teacher;
import com.br.lcts.model.DTO.TeacherDTO;
import com.br.lcts.model.Student;
import com.br.lcts.model.DTO.StudentDTO;

public class ParserObject {

    public static Student getStudent(StudentDTO studentDTO){
        return new Student(studentDTO.getName(),
                studentDTO.getUsername(),
                studentDTO.getPassword(),
                studentDTO.getBirthDate(),
                studentDTO.getSex(),
                studentDTO.getStreet(),
                studentDTO.getCity(),
                studentDTO.getState(),
                studentDTO.getPostalCode(),
                studentDTO.getPhone(),
                studentDTO.getEmail(),
                studentDTO.getRg(),
                studentDTO.getOrgExp(),
                studentDTO.getCpf());
    }

    public static Teacher getTeacher(TeacherDTO teacherDTO){
        return new Teacher(teacherDTO.getName(),
                teacherDTO.getUsername(),
                teacherDTO.getPassword(),
                teacherDTO.getBirthDate(),
                teacherDTO.getSex(),
                teacherDTO.getStreet(),
                teacherDTO.getCity(),
                teacherDTO.getState(),
                teacherDTO.getPostalCode(),
                teacherDTO.getPhone(),
                teacherDTO.getEmail(),
                teacherDTO.getRg(),
                teacherDTO.getOrgExp(),
                teacherDTO.getCpf());
    }
}