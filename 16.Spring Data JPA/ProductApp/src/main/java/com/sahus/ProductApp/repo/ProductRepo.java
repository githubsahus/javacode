package com.sahus.ProductApp.repo;

import com.sahus.ProductApp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product, Integer> {
    List<Product> findByNameContaining(String name);
    List<Product> findByNameOrDescriptionContaining(String name, String description);
}
