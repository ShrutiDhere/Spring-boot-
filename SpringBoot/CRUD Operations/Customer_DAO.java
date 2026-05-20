package com.Spring.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Spring.Entity.Customer;

@Repository
public class Customer_DAO {
	
	@Autowired
	SessionFactory factory ;
	
	public String insertData(Customer c) {
		
		Session ss=factory.openSession();
		Transaction tr=ss.beginTransaction();
		
		ss.persist(c);
		tr.commit();
		ss.close();
		
		
		return "Data is inserted";
		
	}

}
