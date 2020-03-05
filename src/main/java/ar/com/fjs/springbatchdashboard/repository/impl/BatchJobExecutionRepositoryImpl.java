package ar.com.fjs.springbatchdashboard.repository.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.zaxxer.hikari.HikariDataSource;

import ar.com.fjs.springbatchdashboard.mappers.BatchJobExecutionRowMapper;
import ar.com.fjs.springbatchdashboard.model.BatchJobExecution;
import ar.com.fjs.springbatchdashboard.repository.BatchJobExecutionRepository;

@Repository
public class BatchJobExecutionRepositoryImpl implements BatchJobExecutionRepository {

	private JdbcTemplate jdbcTemplate;
	
	public BatchJobExecutionRepositoryImpl(HikariDataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<BatchJobExecution> findAll() {
		StringBuilder sql = new StringBuilder()
				.append("SELECT JOB_EXECUTION_ID, VERSION, JOB_INSTANCE_ID, CREATE_TIME, START_TIME,  ")
				.append("END_TIME, STATUS, EXIT_CODE, EXIT_MESSAGE, LAST_UPDATED, JOB_CONFIGURATION_LOCATION ")
				.append("FROM BATCH_JOB_EXECUTION");
		
		return jdbcTemplate.query(sql.toString(), new BatchJobExecutionRowMapper());
	}

	@Override
	public BatchJobExecution findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
