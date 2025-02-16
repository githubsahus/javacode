package com.sahus.demo.service;

import com.sahus.demo.model.Jobs;
import com.sahus.demo.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobService {
    @Autowired
    JobRepo repo;
    public List<Jobs> getAllJobs() {
        System.out.println("in service");
        return  repo.findAll();
    }

    public Jobs getJob(int jobid) {
        return repo.findById(jobid).orElse(new Jobs());
    }

    public void addJob(Jobs job) {
        repo.save(job);
    }

    public void updateJob(Jobs job) {
        repo.save(job);
    }

    public void deleteJob(int jobId) {
        repo.deleteById(jobId);
    }

    List<Jobs> jobs = new ArrayList<>();
    public void loadJobs(){
        jobs.add(new Jobs(1, "Developer"));
        jobs.add(new Jobs(2, "Tester"));
        jobs.add(new Jobs(3, "Accountant"));

        repo.saveAll(jobs);
    }
}
