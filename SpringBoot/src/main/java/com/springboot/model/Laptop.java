package com.springboot.model;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{
    public void code() {
        System.out.println("Coding using Laptop");
    }
}
