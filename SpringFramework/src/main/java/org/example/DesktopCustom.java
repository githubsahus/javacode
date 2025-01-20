package org.example;

import org.springframework.stereotype.Component;

@Component
public class DesktopCustom implements Computer {
    public  DesktopCustom(){
        System.out.println("Desktop object created");
    }
    @Override
    public void code() {
        System.out.println("Coding with desktop");
    }
}
