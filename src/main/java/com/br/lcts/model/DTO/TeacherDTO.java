/**
 * Created by tharyckVasconcelos
 */

package com.br.lcts.model.DTO;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

public class TeacherDTO {
    @NotNull
    @NotEmpty
    @NotBlank
    @Size(min = 2, max = 50, message = "O Nome deve ter entre 2 e 50 caracters.")
    private String name;
    @NotNull
    @NotEmpty
    @NotBlank
    @Size(min = 2, max = 15, message = "O username deve ter ente 2 e 15 caracters.")
    private String username;
    @NotNull
    @NotEmpty
    @NotBlank
    @Size(min = 6, max = 20, message = "A senha deve ter entre 6 e 20 caracters.")
    private String password;
    @NotBlank
    @NotEmpty
    @NotNull
    @Size(min = 8, max = 8, message = "A Data de Nascimento deve ter 8 Numeros.")
    private Date birthDate;
    @NotBlank
    @NotEmpty
    @NotNull
    @Size(min = 1, max = 1, message = "O Sexo deve ser representado com 1 caracter")
    private Character sex;
    @NotBlank
    @NotEmpty
    @NotNull
    @Size(min = 2, max = 50, message = "O Nome da Rua/Avenida deve ter entre 2 e 50 caracters.")
    private String street;
    @NotBlank
    @NotEmpty
    @NotNull
    @Size(min = 2, max = 50, message = "O Nome da cidade deve ter entre 2 e 50 caracters.")
    private String city;
    @NotBlank
    @NotEmpty
    @NotNull
    @Size(min = 2, max = 50, message = "O Nome do Estado deve ter entre 2 e 50 caracters.")
    private String state;
    @NotBlank
    @NotEmpty
    @NotNull
    @Size(min = 8, max = 8, message = "O CEP deve conter 8 Numeros.")
    private Integer postalCode;
    @NotBlank
    @NotEmpty
    @NotNull
    private String phone;
    @NotBlank
    @NotEmpty
    @NotNull
    @Size(min = 10, max = 100, message = "O Email deve ter entre 10 e 100 caracters.")
    private String email;
    @NotBlank
    @NotEmpty
    @NotNull
    @Size(min = 5, max = 15, message = "O RG deve ter entre 5 e 15 caracters.")
    private Integer rg;
    @NotBlank
    @NotEmpty
    @NotNull
    @Size(min = 10, max = 100, message = "O Orgão Expeditor deve ter entre 10 e 100 caracters.")
    private String orgExp;
    @NotBlank
    @NotEmpty
    @NotNull
    @Size(min = 11, max = 11, message = "O CPF deve ter 11 Numeros.")
    private Integer cpf;


    public TeacherDTO() {
    }

    public TeacherDTO(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public TeacherDTO(String name, String username, String password, Date birthDate, Character sex, String street, String city, String state, Integer postalCode, String phone, String email, Integer rg, String orgExp, Integer cpf) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.birthDate = birthDate;
        this.sex = sex;
        this.street = street;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.phone = phone;
        this.email = email;
        this.rg = rg;
        this.orgExp = orgExp;
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Integer postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getRg() {
        return rg;
    }

    public void setRg(Integer rg) {
        this.rg = rg;
    }

    public String getOrgExp() {
        return orgExp;
    }

    public void setOrgExp(String orgExp) {
        this.orgExp = orgExp;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }
}