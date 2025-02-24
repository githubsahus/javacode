package com.sahus.ProductApp.controller;

import com.sahus.ProductApp.model.Product;
import com.sahus.ProductApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {
    @Autowired
    ProductService service;

    @GetMapping("products")
    public List<Product> getAllProduct(){
        return service.findAllProduct();
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

}
