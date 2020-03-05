package ar.com.fjs.springbatchdashboard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.com.fjs.springbatchdashboard.model.BatchJobExecution;
import ar.com.fjs.springbatchdashboard.model.BatchJobExecutionParams;
import ar.com.fjs.springbatchdashboard.model.BatchStepExecution;
import ar.com.fjs.springbatchdashboard.service.BatchJobExecutionService;
import ar.com.fjs.springbatchdashboard.service.impl.BatchStepExecutionServiceImpl;

@Controller
@RequestMapping("/execution")
public class BatchJobExecutionController {
	
	@Autowired
	private BatchJobExecutionService service;
	
	@Autowired
	private BatchStepExecutionServiceImpl stepExecutionService;

	@GetMapping("")
	public String getJobsExecution(Model model) {
		
		List<BatchJobExecution> jobs = service.findAll();
		
		model.addAttribute("jobs", jobs);
		return "job_execution";
	}
	
	@GetMapping("/params/{id}")
	public String getJobExecutionParams(@PathVariable("id") int jobExecutionId, Model model) {
		
		BatchJobExecution jobExecution = service.findById(jobExecutionId);
		List<BatchJobExecutionParams> params = service.findAllParamsById(jobExecutionId);
		
		model.addAttribute("job", jobExecution);
		model.addAttribute("params", params);
		
		return "job_execution_params";
	}
	
	@GetMapping("/steps/{id}")
	public String getJobExecutionSteps(@PathVariable("id") int jobExecutionId, Model model) {
		
		BatchJobExecution jobExecution = service.findById(jobExecutionId);
		List<BatchStepExecution> steps = stepExecutionService.findAllById(jobExecutionId);
		
		model.addAttribute("job", jobExecution);
		model.addAttribute("steps", steps);
		
		return "job_execution_steps";
	}
}
