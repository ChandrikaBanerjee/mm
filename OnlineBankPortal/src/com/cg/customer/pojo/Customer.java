package com.cg.customer.pojo;

import java.time.LocalDate;
public class Customer {
	private final int customerId;
	private String customerName;
	private long contactNumber;
	private String emailId;
	private String dateOfBirth;
	private String permanentAddress;
	private String nationality;
	private String gender;
	
	private static int custId;
	
	static {
		custId = 200;
	}
	
	{
		this.customerId = ++custId;
	}
	
	public Customer(String customerName, long contactNumber, String dateOfBirth, String permanentAddress,
			String nationality, String gender) {
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.dateOfBirth = dateOfBirth;
		this.permanentAddress = permanentAddress;
		this.nationality = nationality;
		this.gender = gender;
	}
	
	
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getGender() {
		return gender;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	

	public String getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress() {
		this.permanentAddress = permanentAddress;
	}
	public int getCustomerId() {
		return customerId;
	}


	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", contactNumber="
				+ contactNumber + ", emailId=" + emailId + ", dateOfBirth=" + dateOfBirth + 
			  ", permanentAddress=" + permanentAddress + ", nationality=" + nationality
				+ ", gender=" + gender + "]";
	}
}
