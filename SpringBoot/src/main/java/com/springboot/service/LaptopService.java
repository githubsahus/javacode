package com.springboot.service;

import com.springboot.model.Laptop;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    public void addLaptopToDB(Laptop lap){
        System.out.println("addLaptop Method Called");
    }
    public boolean isGoodToWork(Laptop lap){
        return true;
    }
}
