package com.example.diyashop.model.backend.dao;

import com.example.diyashop.model.backend.Customer;

import java.util.List;

public interface GenericDAO<T> {

    void add(T entity) ;
    T getById(String i);


    void update(T entity);

    void delete(String userName);

    List<T> getAll();
}
