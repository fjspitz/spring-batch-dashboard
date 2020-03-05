package ar.com.fjs.springbatchdashboard.service;

import java.util.List;

import ar.com.fjs.springbatchdashboard.model.BatchJobInstance;

public interface BatchJobInstanceService extends BaseService<BatchJobInstance> {
	List<BatchJobInstance> findAll();
	
	BatchJobInstance findById(int id);
}
