package com.br.lcts.model;

import com.br.lcts.model.enums.StateRegister;
import com.br.lcts.model.enums.UserType;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity(name = "Professor")
@Table(name = "tb_professor")
public class Teacher extends User {
    @Column
    @Enumerated(EnumType.STRING)
    private StateRegister stateRegister;

    public Teacher() {
    }

    public Teacher(String name, String username, String password, Date birthDate, Character sex, String state, String city, String street, Integer postalCode, String phone, String email, Integer rg, String orgExp, Integer cpf) {
        super(name, username, password, birthDate, sex, state, city, street, postalCode, phone, email, rg, orgExp, cpf);
        this.stateRegister = StateRegister.ACTIVE;
        setRoles(defineRoles());
        setUserType(UserType.TEACHER);
    }

    @Override
    public void setRoles(List<String> roles) {
        super.setRoles(roles);
    }

    public StateRegister getStateRegister() {
        return stateRegister;
    }

    public void toChangeStateRegisterActive(){
        this.stateRegister = StateRegister.ACTIVE;
    }

    public void toChangeStateRegisterSuspended(){
        this.stateRegister = StateRegister.SUSPENDED;
    }

    private List<String> defineRoles(){
        List<String> roles = new ArrayList<>();
        roles.add(UserType.TEACHER.getType());
        return roles;
    }
}
