package com.hcl.service;

import java.util.List;

import com.hcl.dto.PolicyDto;
import com.hcl.entity.Policy;

public interface IPolicyService {

	public PolicyDto addPolicy(PolicyDto policyDto);

	public List<String> allPolicy();

	public Policy getPolicyByName(String name);

}
