package ar.com.fjs.springbatchdashboard.model;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BatchJobExecutionParams {
	private int jobExecutionId;
	private String typeCd;
	private String keyName;
	private String stringValue;
	private Timestamp datetimeValue;
	private long longValue;
	private double doubleValue;
	private String identifying;
}
