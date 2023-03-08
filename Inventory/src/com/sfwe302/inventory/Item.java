package com.sfwe302.inventory;

public class Item {
	
	//Fields for an inventory item 
	protected String itemName;
	protected double itemPrice;
	protected int itemQuantity;
	
	//Constructor for Item, sets name, price and quantity when called. 
	public Item(String n, double p, int q) {
		this.itemName = n;
		this.itemPrice = p;
		this.itemQuantity = q;	
	}
	
	//Getter methods for each field
	public String getName() {
		return this.itemName;
	}
	public double getPrice() {
		return this.itemPrice;
	}
	public int getQuantity() {
		return this.itemQuantity;
	}
	
	/**
	 * This method will decrement the given item stock 
	 * if it is purchased by a customer or removed from the shelf. 
	 * @param amount int represents how many to decrement. 
	 */
	public void decrementStock(int amount) {
		this.itemQuantity -= amount; 
	}
	
	/*
	 * Print method for the single item.
	 * Implemented in the Inventory class to print out list of items. 
	 */
	public void print() {
		
		String formatPrice = String.format("%.2f", this.itemPrice);
		System.out.println("Item: " + this.itemName + "\nPrice: $" + formatPrice + "\nQuantity: " + this.itemQuantity);;
	}

}
