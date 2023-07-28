/**
 * 
 */
package com.db.service;

import com.db.bean.Customer;

/**
 * 
 */
public class CustomerService {
	 Customer customer[] = new Customer[3];

	    public void createCustomer(){
	    	//add first record of customer
	        customer[0] = new Customer();
	        customer[0].setCustomerId(101);
	        customer[0].setCustomerAddress("Delhi");
	        customer[0].setCustomerName("Anshu");

	        // add second record here
	        customer[1] = new Customer();
	        customer[1].setCustomerId(102);
	        customer[1].setCustomerAddress("Mumbai");
	        customer[1].setCustomerName("Sachin");
	        // add third record here
	        customer[2] = new Customer();
	        customer[2].setCustomerId(131);
	        customer[2].setCustomerAddress("Chennai");
	        customer[2].setCustomerName("Roshini");
	        
	        System.out.println("Customer Created");
	    }
	public void listCustomer() {
		System.out.println("list customer here");
		for(Customer cust:customer) {
			if(cust.getCustomerId()!=-1)
			System.out.println("details of Customer records: "+ cust.getCustomerId()+"----- "+cust.getCustomerName()+"-------"+ cust.getCustomerAddress());
			
		}
	}
	public boolean UpdateCustomer(int id) {
		System.out.println("Customer is updated");
		for(Customer cust:customer) {
			if(cust.getCustomerId()==id) {
				cust.setCustomerId(id);
	        	cust.setCustomerAddress("RamNamagr");
	        	cust.setCustomerName("Mukul");
			}
		}
		
        
		return true;
	}
	public boolean deleteCustomer(int id) {
		System.out.println("Customer is deleted");
		for(Customer cust:customer) {
			if(cust.getCustomerId()==id) {
				cust.setCustomerId(-1);
	        	cust.setCustomerAddress("");
	        	cust.setCustomerName("");
			}
		}
		return true;
	}
}
