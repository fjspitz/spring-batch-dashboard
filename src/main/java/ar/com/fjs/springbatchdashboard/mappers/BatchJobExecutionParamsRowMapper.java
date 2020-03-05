package ar.com.fjs.springbatchdashboard.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import ar.com.fjs.springbatchdashboard.model.BatchJobExecutionParams;

public class BatchJobExecutionParamsRowMapper implements RowMapper<BatchJobExecutionParams> {

	@Override
	public BatchJobExecutionParams mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		return new BatchJobExecutionParams(
				rs.getInt("JOB_EXECUTION_ID"),
				rs.getString("TYPE_CD"),
				rs.getString("KEY_NAME"),
				rs.getString("STRING_VAL"),
				rs.getTimestamp("DATE_VAL"),
				rs.getLong("LONG_VAL"),
				rs.getDouble("DOUBLE_VAL"),
				rs.getString("IDENTIFYING"));
	}

}
