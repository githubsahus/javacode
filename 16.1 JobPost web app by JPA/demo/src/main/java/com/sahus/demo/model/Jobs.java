package com.sahus.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Jobs {
    @Id
    private int jobId;
    private String jobDesc;


    public int getJobId() {
        return jobId;
    }

    public String getJobDesc() {
        return jobDesc;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public void setJobDesc(String desc) {
        this.jobDesc = desc;
    }

    public Jobs(int jobId, String desc) {
        this.jobId = jobId;
        this.jobDesc = desc;
    }

    public Jobs() {
    }
}
