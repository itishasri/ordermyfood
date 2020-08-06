package com.omfuserservice.dto;

import com.omfuserservice.model.Customer;

import lombok.Data;

@Data
public class CustomerDto {
	
	private String firstName;
	private String middleName;
	private String lastName;
	private boolean isActive;
	private String username;
	private String password;
	
	public CustomerDto() {}
	public CustomerDto(Customer customer) {
		this.firstName = customer.getFirstName();
		this.middleName = customer.getMiddleName();
		this.lastName = customer.getLastName();
		this.isActive = customer.isActive();
		this.username = customer.getUsername();
		this.password = customer.getPassword();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
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
	
}
