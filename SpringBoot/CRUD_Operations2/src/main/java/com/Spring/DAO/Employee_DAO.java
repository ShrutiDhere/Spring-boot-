package com.Spring.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Spring.Entity.Employee;

@Repository
public class Employee_DAO {
	
	@Autowired
	SessionFactory factory ;
	
	public String insertData(Employee e) {
		
		Session ss=factory.openSession();
		Transaction tr=ss.beginTransaction();
		
		ss.persist(e);
		tr.commit();
		ss.close();
		
		
		return "Data is inserted";
	
	}

}
