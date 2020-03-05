package ar.com.fjs.springbatchdashboard.model;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BatchJobExecution {
	private int jobExecutionId;
	private int version;
	private int jobInstanceId;
	private Timestamp createTime;
	private Timestamp startTime;
	private Timestamp endTime;
	private String status;
	private String exitCode;
	private String exitMessage;
	private Timestamp lastUpdated;
	private String jobConfigurationLocation;
}
