package com.sfwe302.account;

import java.util.ArrayList;

public class Customer extends Account{
	
	public ArrayList <String> prescriptionList;

	/**
	 * Constructor for the Customer class,
	 * initializes the prescriptionList so new items can be added. 
	 */
	public Customer(){
		this.prescriptionList = new ArrayList<String>();
	}
	
	/**
	 * Adds the entered String as a new prescription item
	 * Future iteration may have a prescription class or more information passed. 
	 * @param medicationInfo String representing the prescribed medicine. 
	 */
	public void addPrescription(String medicationInfo) {
		
		this.prescriptionList.add(medicationInfo);
	}
	
	/**
	 * Print method to generate the current prescription list for the customer. 
	 */
	public void printMedications() {
		
		System.out.println("\nPrescription List for " + this.username + ": ");
		for(String s: this.prescriptionList) {
			
			System.out.println(s);
		}
	}
	
}
