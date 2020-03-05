package ar.com.fjs.springbatchdashboard.service;

import java.util.List;

import ar.com.fjs.springbatchdashboard.model.BatchJobExecution;
import ar.com.fjs.springbatchdashboard.model.BatchJobExecutionParams;

public interface BatchJobExecutionService extends BaseService<BatchJobExecution>{

	List<BatchJobExecutionParams> findAllParamsById(int id);
}
