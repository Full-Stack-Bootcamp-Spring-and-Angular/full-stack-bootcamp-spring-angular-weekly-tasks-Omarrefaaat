package com.example.demo.Model;

import com.example.demo.Entity.Product;
import com.example.demo.Entity.ProductDetails;
import com.example.demo.Model.ProductModel;

public class ProductMapper {
    public static Product toEntity (ProductModel m){
        Product p = new Product();
        p.setId(m.getId());
        p.setName(m.getName());
        ProductDetails pd = new ProductDetails();
        pd.setPrice(m.getPrice());
        pd.setProductAvailable(m.getProductAvailable());
        p.setProductDetails(pd);
        return p;
    }

    public static ProductModel toModel (Product p){
        if (p == null) return null;
        ProductModel m = new ProductModel();
        m.setId(p.getId());
        m.setName(p.getName());
        if(p.getProductDetails() != null){
            m.setPrice(p.getProductDetails().getPrice());
            m.setProductAvailable(p.getProductDetails().getProductAvailable());
        }
        return m;
    }
}
