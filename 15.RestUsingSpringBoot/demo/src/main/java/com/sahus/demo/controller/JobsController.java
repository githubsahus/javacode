package com.sahus.demo.controller;

import com.sahus.demo.model.Jobs;
import com.sahus.demo.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

}
