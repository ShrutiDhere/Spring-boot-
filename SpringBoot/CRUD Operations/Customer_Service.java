package com.Spring.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.DAO.Customer_DAO;
import com.Spring.Entity.Customer;

@Service
public class Customer_Service {
	
	@Autowired
	Customer_DAO dao;
	
	public String insertData(Customer c) {
		
		String msg = dao.insertData(c);
		
		
		
		return msg;
		
	}
	
	

}
