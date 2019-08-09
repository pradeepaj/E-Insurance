package com.hcl.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name ="licPolicy")
public class Policy {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long policyId;
	private String name;
	private int duration;
	
	

}
