package com.adminPanel.app.Service;

import com.adminPanel.app.Entity.Product;
import com.adminPanel.app.Entity.ProductDetails;
import com.adminPanel.app.dao.ProductDao;
import com.adminPanel.app.model.ProductMapper;
import com.adminPanel.app.model.ProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;


    @Override
    @Transactional
    public ProductModel save(ProductModel model) {
        Product entity = ProductMapper.toEntity(model);

        if (entity.getProductDetails() == null) {
            ProductDetails details = new ProductDetails();
            entity.setProductDetails(details);
        }

        if (model.getPrice() != null) {
            entity.getProductDetails().setPrice(model.getPrice());
        }

        Product saved = productDao.insert(entity);

        return ProductMapper.toModel(saved);
    }

    @Override
    @Transactional
    public ProductModel update(int id, ProductModel model) {
        Product entity = ProductMapper.toEntity(model);
        Product saved = productDao.update(entity);
        return ProductMapper.toModel(saved);
    }

    @Override
    @Transactional
    public ProductModel getById(int id) {
        Product p = productDao.findById(id);
        return ProductMapper.toModel(p);
    }

    @Override
    @Transactional
    public void delete(int id) {
        productDao.deleteById(id);
    }

    @Override
    @Transactional
    public List<ProductModel> getAll() {
        return productDao.getAllProducts().stream()
                .map(ProductMapper::toModel)
                .toList();
    }
}
