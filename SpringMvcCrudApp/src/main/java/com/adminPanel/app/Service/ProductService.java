package com.adminPanel.app.Service;

import com.adminPanel.app.Entity.Product;
import com.adminPanel.app.model.ProductModel;

import java.util.List;

public interface ProductService {
    ProductModel save(ProductModel productModel);
    ProductModel update(int id,ProductModel productModel);
    ProductModel getById(int id);
    void delete(int id);
    List<ProductModel> getAll();

}
