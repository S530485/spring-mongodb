package com.example.demo.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "UserData")
public class UserData {
	@Id
	@NotNull
	private int id;
	@NotNull(message="Enter First Name")
	private String firstName;
	@NotNull(message="Enter Last Name")
	private String lastName;
	@NotNull(message="Enter Phone Number")
	@Size(min = 10, message = "Phone number should be 10 characters long")
	@Size(max=10, message="Phone number should be 10 characters long")
	private String phoneNumber;
	@NotNull(message="Enter email ID")
	@javax.validation.constraints.Email(message="Enter valid Email")
	private String emailId;
	@NotNull(message="enter Address")
	private String address;
	@NotNull(message="Emter City")
	private String city;
	@NotNull(message="Enter Zip Code")
	private String state;
	@NotNull
	@Positive
	private int zipCode;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
}

