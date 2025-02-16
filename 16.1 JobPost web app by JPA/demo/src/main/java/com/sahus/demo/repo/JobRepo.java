package com.sahus.demo.repo;

import com.sahus.demo.model.Jobs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface JobRepo extends JpaRepository<Jobs, Integer> {

//
//
//    public JobRepo() {
//        addJobs();
//    }
//
//    public List<Jobs> getAllJobs() {
//        return jobs;
//    }
//
//    private void clearJobs() {
//        jobs.clear();
//    }
//
//    public Jobs getJob(int jobId) {
//        for(Jobs job: jobs){
//            if(job.getJobId() == jobId){
//                return job;
//            }
//        }
//        return null;
//    }
//
//    public void addJob(Jobs job) {
//        jobs.add(job);
//    }
//
//
//    public void updateJob(Jobs job) {
//        for(Jobs iJob: jobs){
//            if(iJob.getJobId() == job.getJobId()){
//                iJob.setJobId(job.getJobId());
//                iJob.setDesc(job.getDesc());
//            }
//        }
//    }
//
//    public void deleteJob(int jobId) {
//        jobs.removeIf(iJob -> iJob.getJobId() == jobId);
//    }
}
