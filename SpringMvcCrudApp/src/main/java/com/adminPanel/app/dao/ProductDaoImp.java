package com.adminPanel.app.dao;

import com.adminPanel.app.Entity.Product;
import com.adminPanel.app.Entity.ProductDetails;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class ProductDaoImp implements ProductDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Product insert(Product product) {
            Session session = sessionFactory.getCurrentSession();
            session.save(product);
        return product;
    }

    @Override
    public Product update(Product product) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(product);
        return null;
    }

    @Override
    public Product findById(int id) {
        Session session = sessionFactory.getCurrentSession();
        Product product = (Product) session.get(Product.class, id);
        return product;
    }

    @Override
    public Product deleteById(int id) {
        try {
            Session session = sessionFactory.getCurrentSession();
            Product product = (Product) session.get(Product.class, id);
            Query query = session.createQuery("delete from Product p where p.id=:id");
            query.setParameter("id", id);
            query.executeUpdate();
            query = session.createQuery("delete from ProductDetails p where p.id=:id");
            query.setParameter("id", id);
            query.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        return sessionFactory.getCurrentSession()
                .createQuery("from Product", Product.class)
                .getResultList();
    }
}
