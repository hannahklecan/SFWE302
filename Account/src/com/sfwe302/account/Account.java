package com.sfwe302.account;

public class Account {
	
	//Fields for the general account 
	protected String username;
	protected String birthdate;

	//Setter methods for general account 
	public void setName(String username) {
		
		this.username = username;
	}
	public void setBirthdate(String birthdate) {
		
		this.birthdate = birthdate;
	}
	
	//Getter methods
	public String getName() {
		
		return this.username;
	}
	public String getBirthdate() {
		
		return this.birthdate;
	}
	
	/**
	 * Print method for the general account
	 */
	public void print() {
		System.out.println("Username: " + this.username + "\nBirthdate: " + this.birthdate);
	}

}

