package ar.com.fjs.springbatchdashboard.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.fjs.springbatchdashboard.model.BatchStepExecution;
import ar.com.fjs.springbatchdashboard.repository.BatchStepExecutionRepository;

@Service
public class BatchStepExecutionServiceImpl {

	@Autowired
	private BatchStepExecutionRepository repository;
	
	public List<BatchStepExecution> findAllById(int id) {
		return repository.findAllById(id);
	}
}
