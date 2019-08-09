package com.hcl.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="licCustomer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long customerId;
	private String name;
	private LocalDate dob;
	private String phone;
	private String email;
	
	
	//@JsonManagedReference
	@ManyToMany
	@JoinTable(
			  name = "lic_policy", 
			  joinColumns = @JoinColumn(name = "customer_id"), 
			  inverseJoinColumns = @JoinColumn(name = "policy_id"))
	private List<Policy> policy;
	
	
	
	
}
