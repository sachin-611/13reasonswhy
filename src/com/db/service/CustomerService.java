
package com.db.service;
import java.util.*;

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
		for(int i=0;i<totalCustomers;i++) {
			System.out.println(customer.get(i).getCustomerId()+" "+customer.get(i).getCustomerName()+" "+customer.get(i).getCustomerAddress());
		}
		System.out.println();
	}
	
	public boolean updateCustomer(int id,String name,String address){
		for(int i=0;i<totalCustomers;i++){
			if(customer.get(i).getCustomerId()==id)
			{
				customer.get(i).setCustomerName(name);
				customer.get(i).setCustomerAddress(address);
				System.out.println("Customer is updated");
				System.out.println();
				return true;
			}
		}
		System.out.println("Customer id is not valid");
		return false;
	}
	
	public boolean deleteCustomer(int id){
		for(int i=0;i<totalCustomers;i++){
			if(customer.get(i).getCustomerId()==id)
			{
				customer.remove(i);
				totalCustomers--;
				System.out.println("Customer is deleted");
				System.out.println();
				return true;
			}
		}
		System.out.println("Customer id is not valid");
		return false;
	}
}