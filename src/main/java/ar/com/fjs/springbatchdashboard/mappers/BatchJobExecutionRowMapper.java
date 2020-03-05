package ar.com.fjs.springbatchdashboard.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import ar.com.fjs.springbatchdashboard.model.BatchJobExecution;

public class BatchJobExecutionRowMapper implements RowMapper<BatchJobExecution> {

	@Override
	public BatchJobExecution mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		return new BatchJobExecution(
				rs.getInt("JOB_EXECUTION_ID"),
				rs.getInt("VERSION"),
				rs.getInt("JOB_INSTANCE_ID"),
				rs.getTimestamp("CREATE_TIME"),
				rs.getTimestamp("START_TIME"),
				rs.getTimestamp("END_TIME"),
				rs.getString("STATUS"),
				rs.getString("EXIT_CODE"),
				rs.getString("EXIT_MESSAGE"),
				rs.getTimestamp("LAST_UPDATED"),
				rs.getString("JOB_CONFIGURATION_LOCATION"));
	}
}
