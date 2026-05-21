package com.Spring.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {

	
	@Id
	private int id;
	private String Name;
	private String Gender;
	private String Adress;
	private String City;
	private String Joining_date;
	private String Role;
	private String Salary;
	
	
	public Employee() {
		
		// TODO Auto-generated constructor stub
	}


	public Employee(int id, String name, String gender, String adress, String city, String joining_date, String role,
			String salary) {
		super();
		this.id = id;
		Name = name;
		Gender = gender;
		Adress = adress;
		City = city;
		Joining_date = joining_date;
		Role = role;
		Salary = salary;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getGender() {
		return Gender;
	}


	public void setGender(String gender) {
		Gender = gender;
	}


	public String getAdress() {
		return Adress;
	}


	public void setAdress(String adress) {
		Adress = adress;
	}


	public String getCity() {
		return City;
	}


	public void setCity(String city) {
		City = city;
	}


	public String getJoining_date() {
		return Joining_date;
	}


	public void setJoining_date(String joining_date) {
		Joining_date = joining_date;
	}


	public String getRole() {
		return Role;
	}


	public void setRole(String role) {
		Role = role;
	}


	public String getSalary() {
		return Salary;
	}


	public void setSalary(String salary) {
		Salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", Name=" + Name + ", Gender=" + Gender + ", Adress=" + Adress + ", City=" + City
				+ ", Joining_date=" + Joining_date + ", Role=" + Role + ", Salary=" + Salary + "]";
	}
	
	
	
	
	
	
}
