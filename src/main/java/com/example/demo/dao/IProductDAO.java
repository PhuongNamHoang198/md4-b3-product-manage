package com.example.demo.dao;

import com.example.demo.model.Product;

import java.util.List;

public interface IProductDAO {
    List<Product> findAll();
    void save(Product product);
    Product findById(int id);
    List<Product> findByName(String name);
    void update(int id, Product product);
    void remote(int it);
}
