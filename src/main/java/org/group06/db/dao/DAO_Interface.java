package org.group06.db.dao;

import org.group06.model.entity.KhuyenMai;

import java.util.ArrayList;
public interface DAO_Interface<T> {

    ArrayList<T> getAll();
    T getByID(String id);
    boolean add(T t);
    boolean update(T t);
    boolean delete(String id);
}
