/**
 * The Pharmacy module will require services from 
 * Accounts and Inventory. The pharmacy itself must 
 * have a specific Inventory database and a list
 * of accounts tied to the given Pharmacy. 
 * 
 * @author hannah klecan 
 */
module Pharmacy {
	exports com.sfwe302.Pharmacy;
	
	requires Accounts;
	requires Inventory;
	
}