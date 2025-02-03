package com.sahus.app.service;
import com.sahus.app.model.JobPosts;

import com.sahus.app.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    JobRepo repo;
    public List<JobPosts> getAllJobs() {
        return repo.getAllJobs();
    }

    public void addJobPost(JobPosts jobPosts) {
        repo.addJobPosts(jobPosts);
    }
}
