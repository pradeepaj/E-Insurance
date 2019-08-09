package com.hcl.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.dto.PolicyDto;
import com.hcl.entity.Policy;
import com.hcl.service.IPolicyService;

@RequestMapping
@RestController
public class PolicyController {
	
	@Autowired
	private IPolicyService policyService;
	@PostMapping("/policy")
	public ResponseEntity<PolicyDto> addPolicy(@RequestBody PolicyDto policyDto){
		return new ResponseEntity<>(policyService.addPolicy(policyDto),HttpStatus.CREATED);
		
	}
	
	@GetMapping("/policy")
	public ResponseEntity<List<String>> allPolicy(){
		return new ResponseEntity<>(policyService.allPolicy(),HttpStatus.OK);
	}
	
	@GetMapping("/policy/{name}")
	public ResponseEntity<PolicyDto> getPolicyByName(@PathVariable String name){
		Policy policy=policyService.getPolicyByName(name);
		PolicyDto policyDto=new PolicyDto();
		BeanUtils.copyProperties(policy, policyDto);
		
		return new ResponseEntity<>(policyDto,HttpStatus.OK);
	}
	

}
