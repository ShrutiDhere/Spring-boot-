package com.Spring.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.Entity.Customer;
import com.Spring.Service.Customer_Service;

@RestController
public class Customer_Controller {

	@Autowired
	Customer_Service Service;
	
	@PostMapping("/register")
	public String insertData(@RequestBody Customer c) {
		String msg =Service.insertData(c);
		return msg;
	}
	
	
	
	
}
