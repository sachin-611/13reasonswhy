/**
 * 
 */
package com.db.demo;

import com.db.service.CustomerService;

/**
 * 
 */
public class CustomerClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CustomerService service=new CustomerService();
		service.createCustomer();
		service.listCustomer();
		System.out.println(service.UpdateCustomer(101));
		service.listCustomer();
		System.out.println(service.deleteCustomer(101));
		service.listCustomer();
	}

}
