package com.hcl.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PolicyDto {
	private long policyId;
	private String name;
	private int duration;
	
}
