package com.sahus.app.repo;

import com.sahus.app.model.JobPosts;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class JobRepo {
    List<JobPosts> jobs = new ArrayList<>();

    public JobRepo() {
        jobs.add(new JobPosts(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
                List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")));
    }

    public List<JobPosts> getAllJobs() {
        return jobs;
    }

    public void addJobPosts(JobPosts jobPosts) {
        jobs.add(jobPosts);
    }
}
