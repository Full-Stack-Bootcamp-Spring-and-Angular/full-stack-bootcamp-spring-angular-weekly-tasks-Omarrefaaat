package com.example.demo.Service;

import com.example.demo.Entity.Product;
import com.example.demo.Entity.ProductDetails;
import com.example.demo.Repository.ProductRepository;
import com.example.demo.Model.ProductMapper;
import com.example.demo.Model.ProductModel;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;


    @Override
    @Transactional
    public ProductModel insert(ProductModel model) {
        Product entity = ProductMapper.toEntity(model);

        if (entity.getProductDetails() == null) {
            ProductDetails details = new ProductDetails();
            entity.setProductDetails(details);
        }

        if (model.getPrice() != null) {
            entity.getProductDetails().setPrice(model.getPrice());
        }

        Product saved = productRepository.save(entity);

        return ProductMapper.toModel(saved);
    }

    @Override
    @Transactional
    public ProductModel update(int id, ProductModel model) {
        Product entity = ProductMapper.toEntity(model);
        Product saved = productRepository.save(entity);
        return ProductMapper.toModel(saved);
    }

    @Override
    @Transactional
    public ProductModel getById(int id) {
        Product p = productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));
        return ProductMapper.toModel(p);
    }

    @Override
    @Transactional
    public void delete(int id) {
        productRepository.deleteById(id);
    }

    @Override
    @Transactional
    public List<ProductModel> getAll() {
        return productRepository.findAll().stream()
                .map(ProductMapper::toModel)
                .toList();
    }
}
