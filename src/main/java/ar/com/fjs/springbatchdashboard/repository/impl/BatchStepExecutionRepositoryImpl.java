package ar.com.fjs.springbatchdashboard.repository.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.zaxxer.hikari.HikariDataSource;

import ar.com.fjs.springbatchdashboard.mappers.BatchStepExecutionRowMapper;
import ar.com.fjs.springbatchdashboard.model.BatchStepExecution;
import ar.com.fjs.springbatchdashboard.repository.BatchStepExecutionRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
public class BatchStepExecutionRepositoryImpl implements BatchStepExecutionRepository {
	private JdbcTemplate jdbcTemplate;
	
	public BatchStepExecutionRepositoryImpl(HikariDataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<BatchStepExecution> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BatchStepExecution findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BatchStepExecution> findAllById(int id) {
		StringBuilder sql = new StringBuilder()
				.append("SELECT STEP_EXECUTION_ID, VERSION, STEP_NAME, JOB_EXECUTION_ID, START_TIME, END_TIME, STATUS, ")
				.append("COMMIT_COUNT, READ_COUNT, FILTER_COUNT, WRITE_COUNT, READ_SKIP_COUNT, WRITE_SKIP_COUNT, ")
				.append("PROCESS_SKIP_COUNT, ROLLBACK_COUNT, EXIT_CODE, EXIT_MESSAGE, LAST_UPDATED ")
				.append("FROM BATCH_STEP_EXECUTION ")
				.append("WHERE JOB_EXECUTION_ID = ?");

		log.info("sql: {}", sql.toString());
		log.info("id: {}", id);
		
	    return jdbcTemplate.query(sql.toString(), new Object[]{id}, new BatchStepExecutionRowMapper());
	}

}
