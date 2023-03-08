/**
 * SFWE302
 * Homework 3 
 * Hannah Klecan
 * 
 * February 21, 2023
 */

package com.sfwe302.main.app;
import com.sfwe302.account.*;
import com.sfwe302.checkout.*;
import com.sfwe302.Pharmacy.*;
import com.sfwe302.inventory.*;

public class MainApp {
	
	@SuppressWarnings("exports")
	public static Pharmacy pharmacy0 = new Pharmacy();
	
	public static void main(String[] args) {
		
		System.out.print("main.app Module\n");
		
		System.out.println("\nTesting Pharmacy module . . .");
		pharmacy0.print();
		
		System.out.println("\nTesting Account module . . .");
		newAccount();

		System.out.println("\nTesting Inventory module . . .");
		buildInventory();
		
		System.out.println("\nTesting Checkout module . . .");
		checkoutSimulator();
		
	}

	/**
	 * Tests the Account module 
	 * 
	 * Adding a new customer to the system
	 * Adds name, birthday and prescriptions. 
	 */
	public static void newAccount() {
		
		System.out.println("New customer account:");

		Customer account0 = new Customer();

		account0.setName("John Doe");
		account0.setBirthdate("01_01_1990");
		
		account0.print();
		account0.addPrescription("Levothyroxine");
		account0.addPrescription("Atorvastatin");
		account0.addPrescription("Amoxicillin");
		
		account0.printMedications();
		
	}
	
	/**
	 * Tests the Inventory Module
	 * 
	 * creates a new Inventory for the Pharmacy
	 * adds items to this Inventory 
	 * prints the current inventory 
	 */
	public static void buildInventory() {
		
		System.out.println("Building New Inventory:");
		
		Inventory inv = new Inventory();
		
		pharmacy0.setInventoryDatabase(inv);
		
		Item i0 = new Item("Levothyroxine",12.62, 1000 );
		Item i1 = new Item("Atorvastatin",11.55, 1564 );
		Item i2 = new Item("Amoxicillin", 23.99, 1764 );
		Item i3 = new Item("Cetirizine", 8.76, 1000);
		
		inv.addItem(i0);
		inv.addItem(i1);
		inv.addItem(i2);
		inv.addItem(i3);
		
		inv.printInventory();
		
	}
	
	/**
	 * Tests the Checkout module
	 * 
	 * creates a customer to test method
	 * chooses one of the available items to test.
	 * simulates the basic checkout process
	 * prints the pharmacy inventory for the item after purchase. 
	 */
	public static void checkoutSimulator() {
		
		Checkout newCheckout = new Checkout();
		
		Customer account = new Customer();

		account.setName("Lucy Li");
		account.setBirthdate("12_01_1998");
		
		Item purchaseItem = pharmacy0.inventoryList.getItem(3);
		
		newCheckout.checkoutCustomer(account, purchaseItem, 2);
		
		//decrease stock by one 
		pharmacy0.inventoryList.getItem(3).decrementStock(2);
				
		//print item data from inventoryList after purchase
		System.out.println("\nItem Quantity after purchase: " + 
				pharmacy0.inventoryList.getItem(3).getQuantity());

	}
}
