package com.hcl.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.dto.PolicyDto;
import com.hcl.entity.Policy;
import com.hcl.repository.PolicyRepository;
@Service
public class PolicyServiceImpl implements IPolicyService {

	@Autowired
	private PolicyRepository policyRepository;
	
	@Override
	public PolicyDto addPolicy(PolicyDto policyDto) {
		Policy policy=new Policy();
		BeanUtils.copyProperties(policyDto, policy);
		 policyRepository.save(policy);
		 return policyDto;
		
	}

}
