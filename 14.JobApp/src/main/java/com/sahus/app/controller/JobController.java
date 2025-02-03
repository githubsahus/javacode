package com.sahus.app.controller;

import org.eclipse.tags.shaded.org.apache.xpath.operations.Mod;
import org.springframework.ui.Model;
import com.sahus.app.model.JobPosts;
import com.sahus.app.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class JobController {

	@Autowired
	JobService service;

	@RequestMapping({"/","/home"})
	public String home() {
		return "home";
	}

	@RequestMapping("viewalljobs")
	public String viewAllJobs(Model model){
		List<JobPosts> jobPosts = service.getAllJobs();
		model.addAttribute("jobPosts", jobPosts);
		return "viewalljobs";
	}

	@RequestMapping("addjob")
	public String addJob(){
		return "addjob";
	}
	@RequestMapping("/handleForm")
	public String handleForm(JobPosts jobPosts, Model model){
		model.addAttribute("jobPost", jobPosts);
		service.addJobPost(jobPosts);
		return "success";
	}
}
