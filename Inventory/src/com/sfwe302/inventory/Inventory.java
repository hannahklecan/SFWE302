package com.sfwe302.inventory;
import java.util.ArrayList;


public class Inventory {

	protected ArrayList <Item> inventoryList;
	
	/*
	 * Constructor for the Inventory
	 * Initializes the ArrayList so items can be added. 
	 */
	public Inventory() {
		
		this.inventoryList = new ArrayList<Item>();
	}
	
	/*
	 * Add the Item i to the Inventory list 
	 */
	public void addItem(Item i) {
		
		this.inventoryList.add(i);
	}
	
	/*
	 * Prints all the items in the current inventory database
	 * Uses the Item class print() method 
	 */
	public void printInventory() {
		
		for(Item i : inventoryList) {
			
			i.print();
		}
	}

	/**
	 * Get a specific inventory item given the item index in the list 
	 */
	public Item getItem(int i) {
		
		return inventoryList.get(i);
		
	}

}
