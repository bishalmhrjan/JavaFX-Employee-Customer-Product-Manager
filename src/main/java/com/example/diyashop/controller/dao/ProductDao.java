package com.example.diyashop.controller.dao;

import com.example.diyashop.controller.admin.Admin;
import com.example.diyashop.model.backend.Product;

import java.util.List;

public class ProductDao extends JpaDao<Product> implements GenericDao<Product> {
    @Override
    public Product get(Object id) {
        return null;
    }
    @Override
    public Product create(Product product) {
        return super.create(product);
    }
    @Override
    public void delete(Object id) {
        super.delete(Product.class,id);

    }
    @Override
    public Product update(Product product) {
        return super.update(product);
    }

    @Override
    public List<Product> listAll() {
        return super.findWithNamedQuery("Product.findAll");
    }


    @Override
    public long count() {
        return super.countWithNamedQuery("Admin.countAll()");
    }
}
