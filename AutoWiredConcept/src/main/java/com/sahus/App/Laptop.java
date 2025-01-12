package com.sahus.App;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
    @Autowired
    Compiler compiler;
    public void code(){
        compiler.compile();
        System.out.println("Coding...");
    }
}
