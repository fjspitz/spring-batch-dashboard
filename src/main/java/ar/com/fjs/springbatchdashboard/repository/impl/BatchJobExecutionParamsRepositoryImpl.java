package ar.com.fjs.springbatchdashboard.repository.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.zaxxer.hikari.HikariDataSource;

import ar.com.fjs.springbatchdashboard.mappers.BatchJobExecutionParamsRowMapper;
import ar.com.fjs.springbatchdashboard.model.BatchJobExecutionParams;
import ar.com.fjs.springbatchdashboard.repository.BatchJobExecutionParamsRepository;

@Repository
public class BatchJobExecutionParamsRepositoryImpl implements BatchJobExecutionParamsRepository {

private JdbcTemplate jdbcTemplate;
	
	public BatchJobExecutionParamsRepositoryImpl(HikariDataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<BatchJobExecutionParams> findAll() {
		StringBuilder sql = new StringBuilder()
				.append("SELECT JOB_EXECUTION_ID, TYPE_CD, KEY_NAME, STRING_VAL, DATE_VAL,  ")
				.append("LONG_VAL, DOUBLE_VAL, IDENTIFYING ")
				.append("FROM BATCH_JOB_EXECUTION_PARAMS");
		
		return jdbcTemplate.query(sql.toString(), new BatchJobExecutionParamsRowMapper());
	}

	@Override
	public BatchJobExecutionParams findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BatchJobExecutionParams> findAllById(int id) {
		StringBuilder sql = new StringBuilder()
				.append("SELECT JOB_EXECUTION_ID, TYPE_CD, KEY_NAME, STRING_VAL, DATE_VAL,  ")
				.append("LONG_VAL, DOUBLE_VAL, IDENTIFYING ")
				.append("FROM BATCH_JOB_EXECUTION_PARAMS ")
				.append("WHERE JOB_EXECUTION_ID = ?");
		
		return jdbcTemplate.query(sql.toString(), new Object[] { id }, new BatchJobExecutionParamsRowMapper());
	}

}
