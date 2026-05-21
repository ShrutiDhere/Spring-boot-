package com.Spring.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.Entity.Employee;
import com.Spring.Entity.Employee;
import com.Spring.Service.Employee_Service;
import com.Spring.Service.Employee_Service;

@RestController
public class Employee_Controller {

	@Autowired
	Employee_Service Service;
	
	@PostMapping("/register")
	public String insertData(@RequestBody Employee e) {
		String msg =Service.insertData(e);
		return msg;
	}
}
