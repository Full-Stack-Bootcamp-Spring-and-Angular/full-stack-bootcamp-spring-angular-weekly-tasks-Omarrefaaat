package com.adminPanel.app.dao;

import com.adminPanel.app.Entity.Product;
import com.adminPanel.app.Entity.ProductDetails;

import java.util.List;

public interface ProductDao {
    Product insert(Product product);
    Product update(Product product);
    Product findById(int id);
    Product deleteById(int id);
    List<Product> getAllProducts();
}
