package com.sfwe302.Pharmacy;
import java.util.ArrayList;
import com.sfwe302.account.Account;
import com.sfwe302.inventory.Inventory;

public class Pharmacy {

	//Fields for Pharmacy 
	protected String name;
	protected String address;
	public ArrayList<Account> accountsList;
	public Inventory inventoryList;
	
	//Constructor for Pharmacy, sets fields of an example Pharmacy for now 
	public Pharmacy() {
		
		this.name = "CherryTree Pharmacy";
		this.address = "1234 Walnut Rd.";
		
		this.accountsList = new ArrayList<Account>();
		this.inventoryList = new Inventory();
	}
	
	/**
	 * Print method for the Pharmacy 
	 */
	public void print() {
		
		System.out.println("Pharmacy name: " + this.name + "\nAddress: " + this.address);
	}
	
	/**
	 * Setter method to assign the current Inventory database i to the Pharmacy 
	 */
	public void setInventoryDatabase(Inventory i) {
		
		this.inventoryList = i;
	}


}
