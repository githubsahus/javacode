package com.sahus.ProductApp.controller;

import com.sahus.ProductApp.model.Product;
import com.sahus.ProductApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {
    @Autowired
    ProductService service;

    @GetMapping("products")
    public ResponseEntity<List<Product>> getAllProduct(){
        return new ResponseEntity<>(service.findAllProduct(), HttpStatus.OK);
    }

    @GetMapping("product/{productid}")
    public Optional<Product> getProduct(@PathVariable int productid){
        return service.findProduct(productid);
    }

    @GetMapping("products/{productName}")
    public List<Product> getProductsByName(@PathVariable("productName") String productName){
//        return service.finproductsByName(productName);
        return  service.findByNameOrDescription(productName);
    }

    @PostMapping(value="/product", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<?> addProduct(@RequestPart Product product, @RequestPart MultipartFile imageFile){
        Product savedProduct = null;
        try {
            savedProduct = service.addProduct(product, imageFile);
            return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
        } catch (IOException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

}
