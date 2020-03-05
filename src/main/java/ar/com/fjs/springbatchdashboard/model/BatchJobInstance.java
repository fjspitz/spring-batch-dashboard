package ar.com.fjs.springbatchdashboard.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BatchJobInstance {
	private int jobInstanceId;
	private int version;
	private String jobName;
	private String jobKey;
}
