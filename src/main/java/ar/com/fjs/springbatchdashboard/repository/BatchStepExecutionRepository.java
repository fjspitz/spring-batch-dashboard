package ar.com.fjs.springbatchdashboard.repository;

import java.util.List;

import ar.com.fjs.springbatchdashboard.model.BatchStepExecution;

public interface BatchStepExecutionRepository extends BaseRepository<BatchStepExecution> {
	List<BatchStepExecution> findAllById(int id);
}
