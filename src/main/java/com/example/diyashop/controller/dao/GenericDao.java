package com.example.diyashop.controller.dao;

import java.util.List;

public interface GenericDao<E> {
    public E create(E t);

    public E update(E t);

    public E get(Object id);

    public void delete(Object id);

    public List<E> listAll();

    public long count();
}
