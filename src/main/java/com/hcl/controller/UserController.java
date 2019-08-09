package com.hcl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.dto.CustomerDto;
import com.hcl.service.IUserService;

@RequestMapping
@RestController
public class UserController {
	@Autowired
	private IUserService userService;
	
	@PostMapping("/user")
	public ResponseEntity<CustomerDto> addUser(@RequestBody CustomerDto customerDto){
		return new ResponseEntity<>(userService.addUser(customerDto),HttpStatus.CREATED);
	}

}
