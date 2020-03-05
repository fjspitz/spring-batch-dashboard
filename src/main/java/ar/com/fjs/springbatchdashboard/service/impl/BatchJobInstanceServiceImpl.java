package ar.com.fjs.springbatchdashboard.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import ar.com.fjs.springbatchdashboard.model.BatchJobInstance;
import ar.com.fjs.springbatchdashboard.repository.BatchJobInstanceRepository;
import ar.com.fjs.springbatchdashboard.service.BatchJobInstanceService;

@Service
public class BatchJobInstanceServiceImpl implements BatchJobInstanceService {

	private BatchJobInstanceRepository repository;
	
	public BatchJobInstanceServiceImpl(BatchJobInstanceRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public List<BatchJobInstance> findAll() {
		return repository.findAll();
	}

	@Override
	public BatchJobInstance findById(int id) {
		return repository.findById(id);
	}

}
