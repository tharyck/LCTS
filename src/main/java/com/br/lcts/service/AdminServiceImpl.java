package com.br.lcts.service;

import com.br.lcts.model.Admin;
import com.br.lcts.repository.AdminRepository;
import com.br.lcts.util.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements CrudService<Admin> {
    private AdminRepository adminRepository;

    @Autowired
    public AdminServiceImpl(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    @Override
    public Admin create(Admin admin) {
        return adminRepository.save(admin);
    }

    @Override
    public List<Admin> getAll() {
        return adminRepository.findAll();
    }

    @Override
    public Admin getById(Long id) {
        return adminRepository.findOne(id);
    }

    public Admin getByUsername(String username){
        return adminRepository.findOneByUsername(username);
    }

    @Override
    public Admin update(Admin admin) {
        return adminRepository.exists(admin.getId()) ? adminRepository.save(admin) : null;
    }

    @Override
    public void removeById(Long id) {
        adminRepository.delete(id);
    }

    @Override
    public void removeAll() {
        adminRepository.deleteAll();
    }
}
