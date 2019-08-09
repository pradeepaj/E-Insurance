package com.hcl.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto {

	private long customerId;
	private String name;
	private LocalDate dob;
	private String phone;
	private String email;
}
