package com.example.demo.Service;
import com.example.demo.Model.ProductModel;

import java.util.List;

public interface ProductService {

    ProductModel insert(ProductModel productModel);
    ProductModel update(int id, ProductModel productModel);
    ProductModel getById(int id);
    void delete(int id);
    List<ProductModel> getAll();

}
