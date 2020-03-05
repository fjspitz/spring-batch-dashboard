package ar.com.fjs.springbatchdashboard.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import ar.com.fjs.springbatchdashboard.model.BatchJobInstance;

public class BatchJobInstanceRowMapper implements RowMapper<BatchJobInstance> {

	@Override
	public BatchJobInstance mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new BatchJobInstance(
				rs.getInt("JOB_INSTANCE_ID"),
				rs.getInt("VERSION"),
				rs.getString("JOB_NAME"),
				rs.getString("JOB_KEY"));
	}
}
