package com.hcl.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="licPolicy")
public class Policy {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long policyId;
	private String name;
	private int duration;
	@JsonBackReference
	@ManyToMany(mappedBy = "customerId")
	private List<Customer> customer; 
	

}
