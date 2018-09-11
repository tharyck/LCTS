package com.br.lcts.bootstrap;

import com.br.lcts.model.*;
import com.br.lcts.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;


@Component
public class UserLoader implements ApplicationListener<ContextRefreshedEvent> {
    private AdminServiceImpl adminService;
    private StudentServiceImpl StudentService;
    private TeacherServiceImpl teacherService;

    @Autowired
    public UserLoader(AdminServiceImpl adminService, StudentServiceImpl StudentService, TeacherServiceImpl teacherService) {
        this.adminService = adminService;
        this.StudentService = StudentService;
        this.teacherService = teacherService;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
//        Admin admin = new Admin("Wendley Paulo","admin","admin");
//        adminService.create(admin);
//
//        Admin admin1 = new Admin("Tharyck", "Tharyck","040696");
//        adminService.create(admin1);

       //Student student1 = new Student("eduarda", "cambista", "cambista", "12345678", "campina grande");
        //StudentService.create(student1);

    }
}