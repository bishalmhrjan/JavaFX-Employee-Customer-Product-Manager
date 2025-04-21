package com.example.diyashop.controller.dao;


import com.example.diyashop.model.entity.Admin;

import java.util.List;

public class AdminDao extends JpaDao<Admin> implements GenericDao<Admin> {

    public AdminDao(){

    }

    @Override
    public Admin create(Admin admin) {
        return super.create(admin);
    }

    @Override
    public Admin update(Admin admin) {
        return super.update(admin);
    }

    @Override
    public Admin get(Object id) {
        return super.find(Admin.class,id);
    }


    @Override
    public void delete(Object id) {
        super.delete(Admin.class,id);
    }

    @Override
    public List<Admin> listAll() {
        return super.findWithNamedQuery("Admin.findAll");
    }

    @Override
    public long count() {
        return super.countWithNamedQuery("Admin.countAll");
    }
}
