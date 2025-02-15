package com.sahus.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Jobs {
    private int jobId;
    private String desc;


    public int getJobId() {
        return jobId;
    }

    public String getDesc() {
        return desc;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Jobs(int jobId, String desc) {
        this.jobId = jobId;
        this.desc = desc;
    }

    public Jobs() {
    }
}
