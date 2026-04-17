package com.adminPanel.app.model;

import com.adminPanel.app.Entity.Product;
import com.adminPanel.app.Entity.ProductDetails;

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
