package com.sahus.demo.controller;

import com.sahus.demo.model.Jobs;
import com.sahus.demo.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@ResponseBody
@Controller
@RequestMapping
public class JobsController {
    @Autowired
    JobService service;

    @GetMapping("jobs")
    public List<Jobs> getAllJobs(){
        System.out.println("in controller");
        return service.getAllJobs();
    }

    @GetMapping("job/{jobId}")
    public Jobs getJob(@PathVariable("jobId") int jobid){
        return service.getJob(jobid);
    }

    @PostMapping("job")
    public Jobs addJob(@RequestBody Jobs job){
        service.addJob(job);
        return job;
    }

    @PutMapping("job")
    public Jobs updateJob(@RequestBody Jobs job){
        service.updateJob(job);
        return service.getJob(job.getJobId());
    }

    @DeleteMapping("job")
    public String deleteJob(@RequestBody Jobs job){
        service.deleteJob(job);
        return "deleted";
    }

}
