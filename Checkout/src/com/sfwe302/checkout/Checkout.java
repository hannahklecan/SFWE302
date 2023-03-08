package com.sfwe302.checkout;


import com.sfwe302.account.Customer;
import com.sfwe302.inventory.Item;

public class Checkout {
	
	//protected Pharmacy currentPharmacy;

	//Constructor to associate the Pharmacy with the Checkout
//	public Checkout(Pharmacy pharmacy) {
//		
//		this.currentPharmacy = pharmacy;
//	}
//	
	/**
	 * Method will take the customer information and the item information
	 * then, it will update the pharmacy database. 
	 */
	public void checkoutCustomer(Customer c, Item i, int quantity) {
		
		System.out.println("Customer " + c.getName() + " wants to purchase " + i.getName());
		
		//determine total price for given item
		double price = i.getPrice() * quantity;
		
		System.out.println("Item: " +i.getName());
		System.out.println("Quantity to buy: " + quantity);
		System.out.println("Price: $" + price);
	}

}
