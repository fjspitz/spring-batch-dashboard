package ar.com.fjs.springbatchdashboard.repository.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.zaxxer.hikari.HikariDataSource;

import ar.com.fjs.springbatchdashboard.mappers.BatchJobInstanceRowMapper;
import ar.com.fjs.springbatchdashboard.model.BatchJobInstance;
import ar.com.fjs.springbatchdashboard.repository.BatchJobInstanceRepository;

@Repository
public class BatchJobInstanceRepositoryImpl implements BatchJobInstanceRepository {
	private JdbcTemplate jdbcTemplate;
	
	public BatchJobInstanceRepositoryImpl(HikariDataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<BatchJobInstance> findAll() {
		StringBuilder sql = new StringBuilder()
				.append("SELECT JOB_INSTANCE_ID, VERSION, JOB_NAME, JOB_KEY ")
				.append("FROM BATCH_JOB_INSTANCE");
		
		return jdbcTemplate.query(sql.toString(), new BatchJobInstanceRowMapper());
	}

	@Override
	public BatchJobInstance findById(int id) {
		StringBuilder sql = new StringBuilder()
				.append("SELECT JOB_INSTANCE_ID, VERSION, JOB_NAME, JOB_KEY ")
				.append("FROM BATCH_JOB_INSTANCE ")
				.append("WHERE JOB_INSTANCE_ID = ?");

	     return jdbcTemplate.queryForObject(sql.toString(), new Object[]{id}, new BatchJobInstanceRowMapper());
	}

}
