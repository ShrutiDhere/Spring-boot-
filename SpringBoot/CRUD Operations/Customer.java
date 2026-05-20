package com.Spring.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {

	@Id
	private int customerId;
	private String Name;
	private String gender;
    private String mobileNumber;
    private String username;
    private String password;
    private String email;
    private String address;
    private String city;
    private String dateOfBirth;
    private int registrationDate;
	
    
    public Customer() {
		
		// TODO Auto-generated constructor stub
	}


	public Customer(int customerId, String Name, String gender, String mobileNumber, String username, String password,
			String email, String address, String city, String dateOfBirth, int registrationDate) {
		
		this.customerId = customerId;
		this.Name = Name;
		this.gender = gender;
		this.mobileNumber = mobileNumber;
		this.username = username;
		this.password = password;
		this.email = email;
		this.address = address;
		this.city = city;
		this.dateOfBirth = dateOfBirth;
		this.registrationDate = registrationDate;
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public String getName() {
		return Name;
	}


	public void setName(String Name) {
		Name = Name;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public int getRegistrationDate() {
		return registrationDate;
	}


	public void setRegistrationDate(int registrationDate) {
		this.registrationDate = registrationDate;
	}


	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", Name=" + Name + ", gender=" + gender + ", mobileNumber="
				+ mobileNumber + ", username=" + username + ", password=" + password + ", email=" + email + ", address="
				+ address + ", city=" + city + ", dateOfBirth=" + dateOfBirth + ", registrationDate=" + registrationDate
				+ "]";
	}
    
    
	
    
    
    
	
}
