package com.sahus.demo.repo;

import com.sahus.demo.model.Jobs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class JobRepo {
    @Autowired
    List<Jobs> jobs = new ArrayList<>();
    public void addJobs(){
        jobs.add(new Jobs(1, "test"));
        jobs.add(new Jobs(1, "test1"));
    }
    public List<Jobs> getAllJobs() {
        addJobs();
        return jobs;
    }
}
