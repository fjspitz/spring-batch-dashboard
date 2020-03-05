package ar.com.fjs.springbatchdashboard.model;

import lombok.Data;

@Data
public class BatchStepExecutionContext {
	private int stepExecutionId;
	private String shortContext;
	private String serializedContext;
}
