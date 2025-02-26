package com.sahus.ProductApp.service;

import com.sahus.ProductApp.model.Product;
import com.sahus.ProductApp.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
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

    public Product addProduct(Product product, MultipartFile imageFile) throws IOException {
        product.setImageName(imageFile.getOriginalFilename());
        product.setImageType(imageFile.getContentType());
        product.setImageData(imageFile.getBytes());
        return  repo.save(product);
    }
}
