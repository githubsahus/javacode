package com.sahus.demo.service;

import com.sahus.demo.model.Jobs;
import com.sahus.demo.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    JobRepo repo;
    public List<Jobs> getAllJobs() {
        System.out.println("in service");
        return  repo.getAllJobs();
    }

    public Jobs getJob(int jobid) {
        return repo.getJob(jobid);
    }

    public void addJob(Jobs job) {
        repo.addJob(job);
    }

    public void updateJob(Jobs job) {
        repo.updateJob(job);
    }

    public void deleteJob(int jobId) {
        repo.deleteJob(jobId);
    }
}
