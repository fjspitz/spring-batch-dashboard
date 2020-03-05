package ar.com.fjs.springbatchdashboard.model;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BatchStepExecution {
	private int stepExecutionId;
	private int version;
	private String stepName;
	private int jobExecutionId;
	private Timestamp startTime;
	private Timestamp endTime;
	private String status;
	private int commitCount;
	private int readCount;
	private int filterCount;
	private int writeCount;
	private int readSkipCount;
	private int writeSkipCount;
	private int processSkipCount;
	private int rollbackCount;
	private String exitCode;
	private String exitMessage;
	private Timestamp lastUpdated;
}
