package com.br.lcts.model;

import com.br.lcts.model.enums.UserType;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity(name = "Admin")
@Table(name = "tb_admin")
public class Admin extends User {

    public Admin() {
    }


    public Admin(String name, String username, String password) {
        super(name, username, password);
        setUserType(UserType.ADMIN);
        setRoles(defineRoles());
    }

    public Admin(String name, String username, String password, Date birthDate, Character sex, String state, String city, String street, Integer postalCode, String phone, String email, Integer rg, String orgExp, Integer cpf) {
        super(name, username, password, birthDate, sex, state, city, street, postalCode, phone, email, rg, orgExp, cpf);
        setUserType(UserType.ADMIN);
        setRoles(defineRoles());
    }

    @Override
    public void setRoles(List<String> roles) {
        super.setRoles(roles);
    }

    private List<String> defineRoles(){
        List<String> roles = new ArrayList<>();
        roles.add(UserType.ADMIN.getType());
        return roles;
    }
}
