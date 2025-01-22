package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.beans.ConstructorProperties;

@Component
public class Alien {
    private int age;
//    private Compiler comp;

    private Computer com;
//    @ConstructorProperties({"age", "comp"})
//    public Alien(int age, Compiler comp) {
//        this.age = age;
//        this.comp = comp;
//    }

    public void code(){
        com.code();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("age setter called");
        this.age = age;
    }
    @Autowired
    @Qualifier("desktopCustom")
    public void setCom(Computer com) {
        this.com = com;
    }
    public Computer getCom() {
        return com;
    }
}
