package com.Spring.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.DAO.Employee_DAO;
import com.Spring.Entity.Employee;

@Service
public class Employee_Service {

	
	@Autowired
	Employee_DAO dao;
	
	public String insertData(Employee e) {
		
		String msg = dao.insertData(e);
		
		
		
		return msg;
	}		
}
