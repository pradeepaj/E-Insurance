package com.hcl.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.dto.CustomerDto;
import com.hcl.entity.Customer;
import com.hcl.repository.UserRepository;
@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public CustomerDto addUser(CustomerDto customerDto) {
		Customer customer=new Customer();
		BeanUtils.copyProperties(customerDto, customer);
		userRepository.save(customer);
		return customerDto;
	}

}
