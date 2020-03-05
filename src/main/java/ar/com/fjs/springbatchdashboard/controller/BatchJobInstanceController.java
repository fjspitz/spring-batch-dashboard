package ar.com.fjs.springbatchdashboard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.com.fjs.springbatchdashboard.model.BatchJobInstance;
import ar.com.fjs.springbatchdashboard.service.BatchJobInstanceService;

@Controller
public class BatchJobInstanceController {

	@Autowired
	private BatchJobInstanceService service;
	
	@GetMapping("/jobs")
	public String getJobs(Model model) {
		List<BatchJobInstance> jobs = service.findAll();
		model.addAttribute("jobs", jobs);
		return "job_instance";
	}
}
