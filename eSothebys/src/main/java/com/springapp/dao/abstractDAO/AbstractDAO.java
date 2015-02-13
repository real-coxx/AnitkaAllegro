package com.springapp.dao.abstractDAO;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Internet on 2015-02-12.
 */
public interface AbstractDAO<T, K extends Serializable> {
    public void create(T entity);
    public void update(T entity);
    public T getById(K id);
    public void delete(T entity);
    public List<T> getAll();
}
