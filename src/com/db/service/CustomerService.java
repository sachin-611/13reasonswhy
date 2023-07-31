package com.db.service;
import java.util.*;
import com.db.exception.CustomerNotFound;

import com.db.bean.Customer;

public class CustomerService {
	
	private int id = 100;
	private int totalCustomers = 0;
	private ArrayList<Customer>customer = new ArrayList<>();
	
	public void createCustomer(String name,String address){
		id++;
		totalCustomers++;
		Customer temp = new Customer();
		temp.setCustomerId(id);
		temp.setCustomerName(name);
		temp.setCustomerAddress(address);
		customer.add(temp);
        System.out.println("Your id is "+id);
        System.out.println();
	}
	
	public void listCustomer(){
		System.out.println("ID    NAME    ADDRESS");
		for(Customer cust:customer) {
			System.out.println(cust.getCustomerId()+" "+cust.getCustomerName()+" "+cust.getCustomerAddress());
		}
		System.out.println();
	}
	
	public void updateCustomer(int id) throws CustomerNotFound{
		for(Customer cust:customer) {
			if(cust.getCustomerId()==id)
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter your name");
            	String name = sc.next();
            	System.out.println("Enter your address");
            	String address = sc.next();
				cust.setCustomerName(name);
				cust.setCustomerAddress(address);
				System.out.println("Customer is updated");
				System.out.println();
				return;
			}
		}
		throw new CustomerNotFound(id);
	}
	
	public void deleteCustomer(int id) throws CustomerNotFound{
		for(Customer cust:customer) {
			if(cust.getCustomerId()==id)
			{
				customer.remove(cust);
				totalCustomers--;
				System.out.println("Customer is deleted");
				System.out.println();
				return;
			}
		}
		throw new CustomerNotFound(id);
	}
}
