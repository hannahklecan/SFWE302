/**
 * The Checkout module will requires services from 
 * Accounts and Inventory. 
 * 
 * When checking out a customer, the Accounts data and 
 * Inventory must be accessed and updated. 
 * 
 * @author hannah klecan 
 **/
module Checkout {
	
	exports com.sfwe302.checkout;
	
	requires Accounts;
	requires Inventory;

}
