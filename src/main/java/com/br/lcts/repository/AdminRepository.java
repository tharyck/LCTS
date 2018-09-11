package com.br.lcts.repository;

import com.br.lcts.model.Admin;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AdminRepository extends CrudRepository<Admin,Long> {
    List<Admin> findAll();
    Admin findOneByUsername(String username);
}
