package com.sahus.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Jobs {
    private int i;
    private String desc;

    public int getI() {
        return i;
    }

    public String getDesc() {
        return desc;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Jobs(int i, String desc) {
        this.i = i;
        this.desc = desc;
    }

    public Jobs() {
    }
}
