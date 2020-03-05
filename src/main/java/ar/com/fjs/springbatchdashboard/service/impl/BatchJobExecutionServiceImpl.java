package ar.com.fjs.springbatchdashboard.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import ar.com.fjs.springbatchdashboard.model.BatchJobExecution;
import ar.com.fjs.springbatchdashboard.model.BatchJobExecutionParams;
import ar.com.fjs.springbatchdashboard.repository.BatchJobExecutionParamsRepository;
import ar.com.fjs.springbatchdashboard.repository.BatchJobExecutionRepository;
import ar.com.fjs.springbatchdashboard.service.BatchJobExecutionService;

@Service
public class BatchJobExecutionServiceImpl implements BatchJobExecutionService {

	private BatchJobExecutionRepository repository;
	
	private BatchJobExecutionParamsRepository paramsRepository;
	
	public BatchJobExecutionServiceImpl(BatchJobExecutionRepository repository, BatchJobExecutionParamsRepository paramsRepository) {
		this.repository = repository;
		this.paramsRepository = paramsRepository;
	}
	
	@Override
	public List<BatchJobExecution> findAll() {
		return repository.findAll();
	}

	@Override
	public BatchJobExecution findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BatchJobExecutionParams> findAllParamsById(int id) {
		return paramsRepository.findAllById(id);
	}

}
