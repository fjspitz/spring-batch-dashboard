package ar.com.fjs.springbatchdashboard.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import ar.com.fjs.springbatchdashboard.model.BatchStepExecution;

public class BatchStepExecutionRowMapper implements RowMapper<BatchStepExecution>{
	
	@Override
	public BatchStepExecution mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new BatchStepExecution(
				rs.getInt("STEP_EXECUTION_ID"),
				rs.getInt("VERSION"),
				rs.getString("STEP_NAME"),
				rs.getInt("JOB_EXECUTION_ID"),
				rs.getTimestamp("START_TIME"),
				rs.getTimestamp("END_TIME"),
				rs.getString("STATUS"),
				rs.getInt("COMMIT_COUNT"),
				rs.getInt("READ_COUNT"),
				rs.getInt("FILTER_COUNT"),
				rs.getInt("WRITE_COUNT"),
				rs.getInt("READ_SKIP_COUNT"),
				rs.getInt("WRITE_SKIP_COUNT"),
				rs.getInt("PROCESS_SKIP_COUNT"),
				rs.getInt("ROLLBACK_COUNT"),
				rs.getString("EXIT_CODE"),
				rs.getString("EXIT_MESSAGE"),
				rs.getTimestamp("LAST_UPDATED"));
	}

}
