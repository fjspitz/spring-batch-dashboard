package ar.com.fjs.springbatchdashboard.repository;

import java.util.List;

import ar.com.fjs.springbatchdashboard.model.BatchJobExecutionParams;

public interface BatchJobExecutionParamsRepository extends BaseRepository<BatchJobExecutionParams> {
	List<BatchJobExecutionParams> findAllById(int id);
}
