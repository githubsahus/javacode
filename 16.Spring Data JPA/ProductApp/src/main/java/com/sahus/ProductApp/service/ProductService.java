package com.sahus.ProductApp.service;

import com.sahus.ProductApp.model.Product;
import com.sahus.ProductApp.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ProductService {
    @Autowired
    ProductRepo repo;
    public List<Product> findAllProduct() {
        System.out.println(repo.findAll());
        return repo.findAll();
    }

    public Optional<Product> findProduct(int productid) {
        return repo.findById(productid);
    }

    public List<Product> finproductsByName(String name) {
        return repo.findByNameContaining(name);
    }

    public List<Product> findByNameOrDescription(String productName) {
        return repo.findByNameOrDescriptionContaining(productName, productName);
    }
}
