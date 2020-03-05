package ar.com.fjs.springbatchdashboard.model;

import lombok.Data;

@Data
public class BatchJobExecutionContext {
	private int jobExecutionId;
	private String shortContext;
	private String serializedContext;
}
