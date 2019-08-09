package com.hcl.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@Entity
@Table(name ="licCustomer")
public class Customer {

	private long customerId;
	private String name;
	private LocalDate dob;
	private String phone;
	private String email;
	
	
	
}
