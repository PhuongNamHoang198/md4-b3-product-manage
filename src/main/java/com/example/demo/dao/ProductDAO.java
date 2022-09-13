package com.example.demo.dao;

import com.example.demo.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductDAO implements IProductDAO{
    private static final Map<Integer, Product> products;
    static {
        products = new HashMap<>();
        products.put(1,new Product(1, "truyen tranh",10000,5));
        products.put(2,new Product(2, "tieu thuyet",15000,12));
        products.put(3,new Product(3, "truyen kinh di",20000,2));
        products.put(4,new Product(4, "truyen hai",25000,3));

    }
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }
    public void save (Product product) {
        product.put(product.getId(),product);

    }
}
